package com.niit.pocono.dao;


	public interface OrderDAO {
		void addOrder(UserDAO user);
	    double getOrderGrandTotal(int cartId);
	}

