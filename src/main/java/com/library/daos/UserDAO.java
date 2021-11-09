package com.library.daos;

import java.util.ArrayList;

import com.library.models.User;

public interface UserDAO {
	
	public boolean addUser(User user);
	
	public ArrayList<User> getAllUsers();
	public ArrayList<User> getClerk(int id);
	public User getUser(int id);
	
}
