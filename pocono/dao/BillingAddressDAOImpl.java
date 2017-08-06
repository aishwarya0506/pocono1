package com.niit.pocono.dao;

import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	@Repository("BillingAddressDAO")
	public class BillingAddressDAOImpl implements BillingAddressDAO 
	{
	@Autowired
	SessionFactory sessionFactory;
	public BillingAddressDAOImpl(SessionFactory sessionFactory) 
	{
			this.sessionFactory = sessionFactory;
		
	}
	@Transactional
	public void saveOrUpdate1(BillingAddressDAO billingAddress) 
	{
	sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
	}
	@Transactional
		public void deleteBillingAddress(String billingAddressId) 
	{
	BillingAddressDAO billingAddressToDelete = new BillingAddressDAO();
	billingAddressToDelete.setBillingAddressId(billingAddressId);
	sessionFactory.getCurrentSession().delete(billingAddressToDelete);
	}
	@Transactional
	public BillingAddressDAO getBillingAddress1(String billingAddressId)
	 {
	return (BillingAddressDAO) sessionFactory.getCurrentSession().get(BillingAddressDAO.class, billingAddressId);
		
	}
	@Override
	public void saveOrUpdate(BillingAddressDAO billingAddress) {
		
		
	}
	@Override
	public BillingAddressDAO getBillingAddress(String billingAddressId) {
		
		return null;
	}

	}

