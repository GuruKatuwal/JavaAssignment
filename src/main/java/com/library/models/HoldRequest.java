package com.library.models;

import java.util.Date;

public class HoldRequest {
	
	Borrower borrower;
	Book book;
	Date requestDate;
	
	//Constructor 
	public HoldRequest(Borrower borrower, Book book, Date requestDate) {
		this.borrower = borrower;
		this.book = book;
		this.requestDate = requestDate;
	}
	
	//Getter and setter
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
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	
    // Print Hold Request Info 
    public void print()
    {
        System.out.print(book.getName() + "\t\t\t\t" + borrower.getFirstName()  + borrower.getLastName()+ "\t\t\t\t"  + requestDate + "\n");
    }

}
