package com.niit.pocono.dao;

import java.util.List;

public interface CategoryDAO {

		public void saveOrUpdate(CategoryDAO category);
		public boolean delete(String id);
		public CategoryDAO get(String id);
		public CategoryDAO getByName(String name);
		public List<CategoryDAO> list();
	}


