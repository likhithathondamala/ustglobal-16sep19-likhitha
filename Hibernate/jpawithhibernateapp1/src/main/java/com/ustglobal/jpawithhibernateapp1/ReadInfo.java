package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernateapp1.dto.StudentInfo;

public class ReadInfo {
public static void main(String[] args) {
	EntityManagerFactory entitymanagerFactory = Persistence.createEntityManagerFactory("Test");
    EntityManager entityManager =  entitymanagerFactory.createEntityManager();
    
  StudentInfo student =  entityManager.find(StudentInfo.class, 1);
    System.out.println("Id :"+ student.getId());
    System.out.println("Name : "+student.getName());
    System.out.println("Dept : "+student.getDept());
    System.out.println("Percentage : " +student.getPercentage());
    
  entityManager.close();
}
}
