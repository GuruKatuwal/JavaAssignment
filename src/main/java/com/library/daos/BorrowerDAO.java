package com.library.daos;

import java.util.ArrayList;

import com.library.models.Borrower;



public interface BorrowerDAO {
	
	public boolean addClerk(Borrower borrower);
	
	public ArrayList<Borrower> getAllBorrower();
	public ArrayList<Borrower> getBorrower(int id);
	
}
