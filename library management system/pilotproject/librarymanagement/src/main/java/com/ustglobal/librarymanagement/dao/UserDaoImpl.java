package com.ustglobal.librarymanagement.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;


@Repository
public class UserDaoImpl implements UserDAO {
	@PersistenceUnit
	EntityManagerFactory factory;
	

	
	@Override
	public Book searchBook(int bid) {
		EntityManager manager = factory.createEntityManager();
		return  manager.find(Book.class, bid);
		
	}

	@Override
	public List<Book> getall(Book book) {
       String jpql = "from Book";
		
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Book> query = manager.createQuery(jpql,Book.class);
		List<Book> bookbean = query.getResultList();
		
		return bookbean;
	}
	

	@Override
	public boolean reserve(int bid) {
		
		BookReserve reserve = new BookReserve();
		reserve.setId(LoginDaoImpl.sid);
		reserve.setBid(bid);
		reserve.setRegistrationDate(new Date());
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(reserve);

		transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return true;
		
		}

}
