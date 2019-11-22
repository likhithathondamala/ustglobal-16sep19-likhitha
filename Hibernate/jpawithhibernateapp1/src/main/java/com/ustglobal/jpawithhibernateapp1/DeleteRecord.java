package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.StudentInfo;

public class DeleteRecord {
public static void main(String[] args) {
	EntityManager entityManager =null;
	 EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		 entityManager  = entityManagerFactory.createEntityManager();
	entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	StudentInfo student = entityManager.find(StudentInfo.class, 1);
	entityManager.remove(student);
	System.out.println("Deleted Record");
	entityTransaction.commit();
	}catch(Exception e ) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
