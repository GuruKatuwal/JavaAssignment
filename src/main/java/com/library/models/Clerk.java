package com.library.models;

public class Clerk extends User{
	
	
	private double salary;
	
	
	public Clerk(int id, String userName, String password, String userType, String firstName, String lastName, String address,
			String phone) {
		super(id,userName, password, userType, firstName, lastName, address, phone);
		
	}

	@Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Salary: " + salary + "\n");         
    }

}
