package com.ustglobal.jpawithhibernate.jpql;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadwithJPQL {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//	String jpql =	"from Product";
//	Query query=entityManager.createQuery(jpql);
//    
//     List<Product>  l  = query.getResultList();
//     for(Product products : l) {
//    	 System.out.println("Id :"+products.getPid());
//    	 System.out.println("Name :"+products.getPname());
//        System.out.println("Quality :"+products.getQuantity());    
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
		
		List<String> l = query.getResultList();
		
		for(String s : l) {
    	 System.out.println("Name :"+s);
		
		 }
     
     

     
		
	}//end of main()

}//end of ReadwithJPQL
