package com.ustglobal.librarymanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.User;
@Repository
public class LoginDaoImpl implements LoginDAO {
@PersistenceUnit
	EntityManagerFactory factory;
    static int sid;
	@Override
	public User login(int id, String password) {
		this.sid=id;
	User user = null;
		try {
		String jpql = "from User where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<User> query = manager.createQuery(jpql,User.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		
		user = query.getSingleResult();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
