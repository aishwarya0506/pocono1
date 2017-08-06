package com.niit.pocono.dao;


	import java.io.IOException;
	import java.util.List;



public interface CartDAO {
	CartDAO getCartById (int cartId);
	CartDAO validate(int cartId) throws IOException;
		   void update(CartDAO cart);
		   List<CartDAO> getCartByUsername (String username);
	}


