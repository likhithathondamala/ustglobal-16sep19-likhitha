package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
     EntityManager entityManager =  entityManagerFactory.createEntityManager();
     
   Product productdetail =  entityManager.find(Product.class, 100);
     System.out.println("Id :"+ productdetail.getPid());
      System.out.println("Name :"+productdetail.getPname());
      System.out.println("Quantity :"+productdetail.getQuantity());
   entityManager.close();
	}//end of main
}//end of ReadDemo
