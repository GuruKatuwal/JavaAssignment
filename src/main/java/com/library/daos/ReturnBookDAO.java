package com.library.daos;

import java.util.ArrayList;

import com.library.models.ReturnedBook;



public interface ReturnBookDAO {
	public boolean addReturnBook(ReturnedBook returnBook);
	
	public ArrayList<ReturnedBook> getAllReturnBook();
	public ArrayList<ReturnedBook> getReturnBook(int id);
	
}
