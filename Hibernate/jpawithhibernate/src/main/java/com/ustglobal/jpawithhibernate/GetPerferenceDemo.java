package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetPerferenceDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			Product product = entityManager.getReference(Product.class, 100);
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
			entityManager.close();
		
	}
}
