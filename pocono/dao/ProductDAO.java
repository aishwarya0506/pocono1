package com.niit.pocono.dao;


	import java.util.List;

	public interface ProductDAO {
	public List<ProductDAO> list();
	public ProductDAO get(String id);
	public void saveOrUpdate(ProductDAO product);
	public boolean delete(String id);
	ProductDAO getProductById(String id);
	public List<ProductDAO> getProductbyCategoryId(String category_id);
	}

