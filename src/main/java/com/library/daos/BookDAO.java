package com.library.daos;

import java.util.ArrayList;

import com.library.models.Book;

public interface BookDAO {
	//Create
	public boolean addBook(Book book);
	
	//Read
	public Book getBook();
	
	public ArrayList<Book> getAllBooks();
	
	//update
	public boolean updateIsIssued(boolean isIssued);
	
	//remove
	 public boolean removeBook();
}
