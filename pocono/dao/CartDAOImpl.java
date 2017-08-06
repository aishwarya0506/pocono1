package com.niit.pocono.dao;


	import java.io.IOException;
	import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	
	@Repository
	@Transactional
	public class CartDAOImpl implements CartDAO
	{
		 @Autowired
		    private SessionFactory sessionFactory;

		    @Autowired
		    private OrderDAO orderDAO;

		    public CartDAO getCartById1 (int cartId) {
		        Session session = sessionFactory.getCurrentSession();
		        return (CartDAO) session.get(CartDAO.class, cartId);
		    }

		    public void update1(CartDAO cart) {
		        int cartId = cart.getCartId();
		        double grandTotal = orderDAO.getOrderGrandTotal(cartId);
		        cart.setGrandTotal(grandTotal);
	             Session session = sessionFactory.getCurrentSession();
		        session.saveOrUpdate(cart);
		    }

		    public CartDAO validate(int cartId) throws IOException {
		        CartDAO cart=getCartById1(cartId);
		        if(cart==null||cart.getCartItems().size()==0) {
		            throw new IOException(cartId+"");
		        }
		        update1(cart);
		        return cart;
		    }

			public List<CartDAO> getCartByUsername(String username) {
				String hql = "from Cart where username=" + "'" + username + "'";
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				List<CartDAO> listOfCart = query.list();
				return  listOfCart;
				}

			@Override
			public CartDAO getCartById(int cartId) {
				
				return null;
			}

			@Override
			public CartDAO validate(int cartId) throws IOException {
				
				return null;
			}

			@Override
			public void update(CartDAO cart) {
				
				
			}
		   
		 }
