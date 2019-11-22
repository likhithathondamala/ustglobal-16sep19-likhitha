package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class Reattaching {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 100);
			System.out.println(entityManager.contains(product));
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			entityManager.merge(product);
			Product product2 =entityManager.find(Product.class, 100);
			product2.setQuantity(45000);
			System.out.println("Updated Record");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
	}
}
