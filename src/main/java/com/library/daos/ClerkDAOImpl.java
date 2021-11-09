package com.library.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.library.models.Clerk;

public class ClerkDAOImpl implements ClerkDAO {
	
	private Connection connection;
	private PreparedStatement statement;
	
	@Override
	public boolean addClerk(Clerk clerk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Clerk> getAllClerk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Clerk> getClerk(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private void closeResources() {
		try {
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch(SQLException ex) {
			System.out.println("Error: Could not close resources.");
			ex.printStackTrace();
		}
	}

}
