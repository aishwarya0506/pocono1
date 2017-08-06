package com.niit.pocono.dao;



	import java.util.List;

		public interface CartItemDAO {
		void addCartItem(CartItemDAO cartItem);

	    void removeCartItem(CartItemDAO cartItem);

	    void removeAllCartItems(CartDAO cart);

	    CartItemDAO getCartItemByItemId (int itemId);
	    
	    List<CartItemDAO> getCartItemByItemName (String itemName);

	    public List<CartItemDAO> list();
	}

