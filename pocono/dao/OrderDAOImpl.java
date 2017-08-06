package com.niit.pocono.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OrderDAOImpl  implements OrderDAO
{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private CartDAO cartDAO;
    public void addOrder(UserDAO userOrderDAO) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(userOrder);
        session.flush();
    }
    public double getOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartDAO.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }
	@Override
	public void addOrder(UserDAO user) {
		// TODO Auto-generated method stub
		
	}
}


