package com.library.models;

import java.util.ArrayList;

public class Borrower extends User{
	
	//constructor


	private ArrayList<Loan> borrowedBooks;
	public Borrower(int id, String userName, String password, String userType, String firstName, String lastName,
			String address, String phone) {
		super(id, userName, password, userType, firstName, lastName, address, phone);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<HoldRequest> onHold;
	
	public ArrayList<Loan> getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(ArrayList<Loan> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	public ArrayList<HoldRequest> getOnHold() {
		return onHold;
	}
	public void setOnHold(ArrayList<HoldRequest> onHold) {
		this.onHold = onHold;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		
	}
	

	
}
