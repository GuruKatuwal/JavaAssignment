package com.library.models;

import java.util.Date;

public class ReturnedBook {
	private Date returnDate;
	private int fine;
	
	//Constructor
	
	public ReturnedBook(Date returnDate, int fine) {
		super();
		this.returnDate = returnDate;
		this.fine = fine;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}


}
