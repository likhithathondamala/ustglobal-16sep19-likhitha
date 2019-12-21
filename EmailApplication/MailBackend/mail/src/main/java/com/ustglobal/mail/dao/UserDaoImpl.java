package com.ustglobal.mail.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.mail.dto.Mail;
import com.ustglobal.mail.dto.User;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean register(User bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		}
	

	@Override
	public boolean login(String email,String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		String jpql="from User where email=:email and password=:password";
		TypedQuery<User> query=manager.createQuery(jpql,User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			User bean=query.getSingleResult();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean changePassword(String email, String password) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user = manager.find(User.class, email);
		user.setPassword(password);
		transaction.commit();
//		manager.close();
		return true;
		
	}
	
	@Override
	public List<Mail> getAllMessages() {
		
		String jpql = "from Mail";
		EntityManager manager = factory.createEntityManager();
		try {
			TypedQuery<Mail> query = manager.createQuery(jpql, Mail.class);
			List<Mail> beans = query.getResultList();
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			manager.close();
		}
		
	}


	@Override
	public boolean compose(Mail mail) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(mail);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean delete(int mid) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			Mail mail = manager.find(Mail.class, mid);
			manager.remove(mail);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	}

