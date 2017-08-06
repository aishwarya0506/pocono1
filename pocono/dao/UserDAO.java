package com.niit.pocono.dao;

import java.util.List;

public interface UserDAO {
public boolean save(UserDAO userDetails);
	
	public boolean update(UserDAO userDetails);
		public boolean delete(UserDAO userDetails);
		
		public List<UserDAO> list();
		
		public boolean isValidUser(String username, String password);

		public UserDAO get(String username);
		 UserDAO getCustomerByUsername (String username);

}
