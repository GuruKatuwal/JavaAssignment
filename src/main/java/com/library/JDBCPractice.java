package com.library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.library.models.Book;
import com.library.utils.DAOUtility;

public class JDBCPractice {
	public static void main(String[] args) {
		ArrayList<Book> books = getAllBooks();
		for(Book book : books) {
			System.out.println(book);
		}
		
	}
	
	public static ArrayList<Book> getAllBooks() {
		ArrayList<Book> books = new ArrayList<>();
		
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
	
	public static Book getBookNotPrepared( String value) {
		Book book = new Book();
		return book;
	}
	public static Book getBookPrepared( String value) {
		Book book = new Book();
		return book;
	}
	
	public static void  callTruncateAll() {
		
	}
}

