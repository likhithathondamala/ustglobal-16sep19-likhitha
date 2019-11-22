package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.Voter_Card;


public class TestOnetoOne {
 public static void main(String[] args) {
	 Voter_Card  vc = new Voter_Card();
	
	 vc.setVid(12);
	 vc.setVname("Kiran");
	 
	 Person p = new Person();
	 p.setPid(22);
	 p.setName("Kiran");
	 p.setVotercard(vc);
	 
	
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction  = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Voter_Card card = entityManager.find(Voter_Card.class, 22);
			System.out.println(card.getPerson().getPid());
			System.out.println(card.getPerson().getName());
			entityManager.persist(p);
			System.out.println("Record Saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	 
}
}
