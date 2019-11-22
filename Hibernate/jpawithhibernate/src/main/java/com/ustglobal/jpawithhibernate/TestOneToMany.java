package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;


public class TestOneToMany {

	public static void main(String[] args) {

		PencilBox pb = new PencilBox();
		pb.setBid(5);
		pb.setBname("classmate");

		Pencil pencil=new Pencil();

		pencil.setId(1);
		pencil.setColor("black");
		pencil.setPencilbox(pb);
		Pencil pencil1 = new Pencil();
		pencil1.setId(2);
		pencil1.setColor("blue");
		pencil1.setPencilbox(pb);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction  = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			Pencil p = entityManager.find(Pencil.class, 12);
//			System.out.println(p.getPencilbox().getBid());
//			System.out.println(p.getPencilbox().getBname());

			entityManager.persist(pencil);
			entityManager.persist(pencil1);

			System.out.println("Record Saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}

}
