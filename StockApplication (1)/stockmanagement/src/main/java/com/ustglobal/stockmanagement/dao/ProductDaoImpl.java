package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.Product_Info;
@Repository
public class ProductDaoImpl  implements ProductDAO{
	@PersistenceUnit
   EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Product_Info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(product);
		transaction.commit();
		manager.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Product_Info updateProduct(Product_Info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		 Product_Info products = manager.find(Product_Info.class,product.getId());
		 products.setName(product.getName());
		 products.setCategory(product.getCategory());
		 products.setCompany(product.getCompany());
		 products.setQuantity(product.getQuantity());
		 product.setPrice(product.getPrice());
		 transaction.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return product;
		
	}

	

	

	@Override
	public  List<Product_Info> getbycategory(String category) {
		
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info where category=:category";
		 TypedQuery<Product_Info> query= manager.createQuery(jpql, Product_Info.class);
		query.setParameter("category", category);
		try {
			List<Product_Info> info = query.getResultList();
			return info;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public  List<Product_Info> getbycompany(String company) {
		
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info where company=:company";
		TypedQuery<Product_Info> query = manager.createQuery(jpql, Product_Info.class);
		query.setParameter("company", company);
		try {
			List<Product_Info> info = query.getResultList();
			return info;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public  Product_Info getbbyname(String name) {
		
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info where name=:name";
		TypedQuery<Product_Info> query = manager.createQuery(jpql, Product_Info.class);
		query.setParameter("name", name);
		try {
			Product_Info info  = query.getSingleResult();
			return info;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	

}
