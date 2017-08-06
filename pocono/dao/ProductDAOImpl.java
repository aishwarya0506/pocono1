package com.niit.pocono.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@EnableTransactionManagement
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO
{
	
	@Autowired
	private SessionFactory sessionFactory;
   public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Transactional
	public List<ProductDAO> list() {
		@SuppressWarnings("unchecked")
		List<ProductDAO> listProduct = (List<ProductDAO>) sessionFactory.getCurrentSession()
				.createCriteria(ProductDAO.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listProduct;
	}

	@Transactional
	public ProductDAO get1(String id) {
		String hql = "from Product where id='" + id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<ProductDAO> listProduct = (List<ProductDAO>) query.list();
		
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		
		return null;
	}

	@Transactional
	public void saveOrUpdate1(ProductDAO product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}

	@Transactional
	public boolean delete(String id) {
		ProductDAO product = new product();
		product.setId(id);
		try {
			sessionFactory.getCurrentSession().delete(product);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}


	@Transactional
	public ProductDAO getProductById(String id) {
		String hql = "from Product where id='" + id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<ProductDAO> listOfProduct = query.list();
			
		if (listOfProduct != null && !listOfProduct.isEmpty()){

			return  listOfProduct.get(0);

		}
				
			
			return null;
	}

	@Transactional
	public List<ProductDAO> getProductbyCategoryId(String category_id) {
		System.out.println("inside product");
		String hql = "from Product where category_id='" +category_id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<ProductDAO> listOfProducts = query.list();
			
			return  listOfProducts;	
	}


	@Override
	public ProductDAO get(String id) {
		
		return null;
	}


	@Override
	public void saveOrUpdate(ProductDAO product) {
		
		
	}


	@Override
	public ProductDAO getProductById(String id) {
		
		return null;
	}


	


}
