package com.library.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.library.models.Book;
import com.library.utils.DAOUtility;

public class BookDaoImpl implements BookDAO {
	
	private Connection connection;
	private PreparedStatement statement;

	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	public Book getBook() {
		Book book = new Book();

		try {
			connection = DAOUtility.getConnection();
			String sql = "SELECT s.*, st.book_name FROM book s, book st WHERE s.book_id = st.id;";
			statement = connection.prepareStatement(sql);
//			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();

			while(rs.next()) {
				int id = rs.getInt("book_id");
				String name = rs.getString("book_name");
				String writer = rs.getString("book_writer");
				String isbn = rs.getString("isbn");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				//				 boolean isIssued = rs.getBoolean("isIssued");

				// add parent to parents arraylist
				book = new Book(id,name,writer,isbn,publisher,price);
			}



		} catch(SQLException ex) {
			System.out.println("Error: Cannot get all students.");
			ex.printStackTrace();
		} finally {
			closeResources();
		}
		return book;
	}

	public ArrayList<Book> getAllBooks() {
		ArrayList<Book> books = new ArrayList<Book>();

		try(Connection connection = DAOUtility.getConnection();
				Statement statement = connection.createStatement();) {

			ResultSet rs = statement.executeQuery("Select * from book");
			while(rs.next()) {
				int id = rs.getInt("book_id");
				String name = rs.getString("book_name");
				String writer = rs.getString("book_writer");
				String isbn = rs.getString("isbn");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				//				 boolean isIssued = rs.getBoolean("isIssued");

				books.add(new Book(id,name,writer,isbn,publisher,price));
			}
			//			connection.close();
			//			statement.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		return books;
	}

	public boolean updateIsIssued(boolean isIssued) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeBook() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void closeResources() {
		try {
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch(SQLException ex) {
			System.out.println("Error: Could not close resources.");
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BookDAO bookDAO = new BookDaoImpl();
		ArrayList<Book> books = bookDAO.getAllBooks();
		for(Book book : books) {
			System.out.println(books);
		}

	}

}
