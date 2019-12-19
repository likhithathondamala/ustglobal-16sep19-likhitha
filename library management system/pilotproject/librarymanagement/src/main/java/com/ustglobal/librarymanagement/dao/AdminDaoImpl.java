package com.ustglobal.librarymanagement.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.ustglobal.librarymanagement.dto.User;
@Repository
public class AdminDaoImpl implements AdminDAO{
	@PersistenceUnit
EntityManagerFactory factory;
	@Override
	public User addLibrarian(User user) {
		user.setType("Librarian");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return user;
	}


	

	@Override
	public Boolean deleteLibrarian(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user=manager.find(User.class, id);
		if(user!=null) {
			manager.remove(user);
			transaction.commit();
			return true;
			}else {
			return false;
			}
	}

	@Override
	public List<User> displayLibrarian() {
		
			 EntityManager manager = factory.createEntityManager();
			TypedQuery<User> typedQuery = manager.createQuery("FROM User WHERE type = 'Librarian'", User.class);
			 List<User>  userlist = typedQuery.getResultList();
			 return userlist;
		}
		
	
		
	}


