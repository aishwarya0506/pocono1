package com.niit.pocono.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.pocono.model.Supplier;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@Repository


public class SupplierDAOImpl implements SupplierDAO
{
@Autowired
private SessionFactory sessionFactory;
public SupplierDAOImpl(SessionFactory sessionFactory)
{
	
	try 
	{
		this.sessionFactory = sessionFactory;
	} 
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@Transactional
public boolean delete(String id) {
	Supplier supplierDAO = new Supplier();
	supplierDAO.setId(id);
	try {
		sessionFactory.getCurrentSession().delete(supplierDAO);
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	return true;
}

@Transactional
public SupplierDAO get1(String id) {
	String hql = "from Supplier where id =" + "'" + id + "'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Supplier> list = (List<Supplier>) query.list();
	if (list != null && !list.isEmpty()) {
		return (SupplierDAO) list.get(1);
	}
	return null;
}

@Transactional
public List<SupplierDAO> list() {
	@SuppressWarnings("unchecked")
	List<SupplierDAO> list = (List<SupplierDAO>) sessionFactory.getCurrentSession().createCriteria(SupplierDAO.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

	return list();
}

@Transactional
public SupplierDAO getByName1(String name) {
	String hql = "from Supplier where name =" + "'" + name + "'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<SupplierDAO> list = (List<SupplierDAO>) query.list();
	if (list != null && !list.isEmpty()) {
		return list.get(0);
	}
	return null;
}

@Transactional
public void saveOrUpdate(Supplier supplier) {
	sessionFactory.getCurrentSession().saveOrUpdate(supplier);
	
}

@Override
public void saveOrUpdate(SupplierDAO supplier) {
	
}

@Override
public SupplierDAO get(String id) {
	return null;
}

@Override
public SupplierDAOImpl getByName(String name) {

	return null;
}
}

