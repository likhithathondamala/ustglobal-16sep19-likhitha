package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernateapp1.dto.StudentInfo;

public class UpdateInfo {
public static void main(String[] args) {
	EntityTransaction entityTransaction =null;
	EntityManager entityManager=null;
  try {
EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("Test");
 entityManager = entityManagerfactory.createEntityManager();
 entityTransaction = entityManager.getTransaction();
entityTransaction.begin();
StudentInfo student = entityManager.find(StudentInfo.class, 1);
student.setId(1);
student.setName("likhitha");
student.setDept("cse");
student.setPercentage(71);
System.out.println("Updated Record");
entityTransaction.commit();
  }catch(Exception e) {
	  e.printStackTrace();
	  entityTransaction.rollback();
  }
  entityManager.close();
}
}

