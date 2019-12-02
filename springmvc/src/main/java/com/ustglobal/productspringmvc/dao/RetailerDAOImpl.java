package com.ustglobal.productspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.productspringmvc.dto.ProductBean;
import com.ustglobal.productspringmvc.dto.RetailerBean;

@Repository
public class RetailerDAOImpl implements RetailerDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public RetailerBean login(int id, String password) {

		String jpql = "from RetailerBean where retailerId=:id and retailerPassword=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean> query = manager.createQuery(jpql, RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		}catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;
		}
	}

	@Override
	public int register(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getRetailerId();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	@Override
	public ProductBean searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductBean.class, id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailerBean bean = manager.find(RetailerBean.class, id);
		bean.setRetailerPassword(password);
		transaction.commit();
		return true;
	}

}
