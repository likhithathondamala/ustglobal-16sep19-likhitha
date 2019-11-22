package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.StudentInfo;

public class InsertInfo {

	public static void main(String[] args) {
		StudentInfo student = new StudentInfo();
		student.setId(1);
		student.setName("likhi");
		student.setDept("cse");
		student.setPercentage(71);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction  = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");

			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record Savaed");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}

}
