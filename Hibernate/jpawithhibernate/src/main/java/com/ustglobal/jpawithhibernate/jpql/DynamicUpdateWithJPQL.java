package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateWithJPQL {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "update Product set pname=:name where pid =:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("name", "Book");
		query.setParameter("id", 34);
		int res = query.executeUpdate();
		System.out.println(res+"Rows Updated");
		entityTransaction.commit();
		entityManager.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		entityManager.close();
	}
}
}
