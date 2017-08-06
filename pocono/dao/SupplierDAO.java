package com.niit.pocono.dao;

import java.util.List;

public interface SupplierDAO {
	
		public void saveOrUpdate(SupplierDAO supplier);
		public boolean delete(String id);
		public  SupplierDAO get(String id);
		public SupplierDAO getByName(String name);
		public List <SupplierDAO> list();
	}

