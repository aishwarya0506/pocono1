package com.niit.pocono.dao;

import java.util.List;

public class UserDAOImpl implements UserDAO{

	@Override
	public boolean save(UserDAO userDetails) {
		return false;
	}

	@Override
	public boolean update(UserDAO userDetails) {
		return false;
	}

	@Override
	public boolean delete(UserDAO userDetails) {
				return false;
	}

	@Override
	public List<UserDAO> list() {
		return null;
	}

	@Override
	public boolean isValidUser(String username, String password) {
		return false;
	}

	@Override
	public UserDAO get(String username) {
	
		return null;
	}

	@Override
	public UserDAO getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
