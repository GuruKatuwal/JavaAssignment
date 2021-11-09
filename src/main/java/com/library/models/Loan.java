package com.library.models;

import java.util.Date;

public class Loan {
	
	private Borrower borrower;
	private Book book;
	private Clerk issuer;
	private Date issuedDate;
	private Clerk receiver;
	
	private boolean finePaid;
	
	//Constructor
	public Loan(Borrower borrower, Book book, Clerk issuer, Date issuedDate, Clerk receiver, boolean finePaid) {
		this.borrower = borrower;
		this.book = book;
		this.issuer = issuer;
		this.issuedDate = issuedDate;
		this.receiver = receiver;
		this.finePaid = finePaid;
	}

	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Clerk getIssuer() {
		return issuer;
	}

	public void setIssuer(Clerk issuer) {
		this.issuer = issuer;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public Clerk getReceiver() {
		return receiver;
	}

	public void setReceiver(Clerk receiver) {
		this.receiver = receiver;
	}

	public boolean isFinePaid() {
		return finePaid;
	}

	public void setFinePaid(boolean finePaid) {
		this.finePaid = finePaid;
	}



}
