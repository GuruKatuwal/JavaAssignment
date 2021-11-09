package com.library.models;

/* Book class holds the information about book
 * answers if book is issued
 *  @author Guru Katuwal
 */

public class Book {
	
	private int id;
	private String name;
	private String writer;
	private String isbn;
	private String publisher;
	private int price;
//	private boolean isIssued;
	
	//Constructor

	public Book( int id, String name, String writer, String isbn, String publisher, int price) {
		super();
		this.name = name;
		this.writer = writer;
		this.isbn = isbn;
		this.publisher = publisher;
		this.price = price;
//		this.isIssued = isIssued;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	public boolean isIssued() {
//		return isIssued;
//	}
//	public void setIssued(boolean isIssued) {
//		this.isIssued = isIssued;
//	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + ", isbn=" + isbn + ", publisher=" + publisher + ", price="
				+ price + "]";
	}
	

	
	

}
