package com.library.daos;

import java.util.ArrayList;

import com.library.models.Loan;

public interface LoanDAO {
	
	public boolean addLoan(Loan loan);
	
	public ArrayList<Loan> getAllLoan();
	public ArrayList<Loan> getLoan(int id);
	
}
