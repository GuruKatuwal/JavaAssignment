package com.library.models;

import java.util.Date;

public class IssuedBook {
	//Constructor
	public IssuedBook(Date issuedDate, int period, String genre) {
		super();
		this.issuedDate = issuedDate;
		this.period = period;
		this.genre = genre;
	}
	private Date issuedDate;
	private int period;
	private String genre;
	
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}


}
