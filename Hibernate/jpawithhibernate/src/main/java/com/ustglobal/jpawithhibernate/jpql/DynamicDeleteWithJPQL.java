package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteWithJPQL {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "delete from Product  where pid =:id";
		Query query = entityManager.createQuery(jpql);
	
		query.setParameter("id", 13);
		int res = query.executeUpdate();
		System.out.println(res+"Rows deleted");
		entityTransaction.commit();
		entityManager.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		entityManager.close();
	}
}
}
