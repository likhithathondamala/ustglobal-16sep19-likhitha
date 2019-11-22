package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteWithJPQL {
public static void main(String[] args) {
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "delete from Product  where pid = 100";
		Query query = entityManager.createQuery(jpql);
		int res = query.executeUpdate();
		System.out.println(res+"Rows Deleted");
		entityTransaction.commit();
		entityManager.close();
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}finally {
		entityManager.close();
	}
}
}
