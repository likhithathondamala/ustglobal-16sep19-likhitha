package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Course;
import com.ustglobal.jpawithhibernate.manytomany.Student;

public abstract class TestManyToMany {

	public static void main(String[] args) {
		
		ArrayList<Course> al = new ArrayList<Course>();
		Course course = new Course();
		course.setCid(21);
		course.setCname("JDBC");
		
		Course course1 = new Course();
		course1.setCid(22);
		course1.setCname("Hibernate");
		
		al.add(course);
		al.add(course1);
		
		
		Student student = new Student();
		student.setSid(12);
		student.setSname("Arun");
		student.setCourse(al);
		
		
		
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
            entityManager.persist(student);
			entityManager.persist(course);
			entityManager.persist(course);

			System.out.println("Record Saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();


	}
}
