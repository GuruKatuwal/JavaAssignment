package com.library.daos;

import java.util.ArrayList;

import com.library.models.Clerk;

public interface ClerkDAO {
	
	public boolean addClerk(Clerk clerk);
	
	public ArrayList<Clerk> getAllClerk();
	public ArrayList<Clerk> getClerk(int id);
	
}
