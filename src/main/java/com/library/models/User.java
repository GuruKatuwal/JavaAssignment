package com.library.models;

public class User {
	private int id;
	private String userName;
	private String password;
	private String userType;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	
	
	
public User(int id, String userName, String password, String userType, String firstName, String lastName,
			String address, String phone) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
	}
//Constructor

	//Getter and setter

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void printInfo() {
	     System.out.println("-----------------------------------------");
	        System.out.println("\nThe details are: \n");
	        System.out.println("UserName: " + userName);
	        System.out.println("Name: " + firstName + lastName);
	        System.out.println("Address: " + address);
	        System.out.println("Phone No: " + phone + "\n");
		
	}

}
