package com.ustglobal.librarymanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookIssue;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;
@Repository
public class LibrarianDaoimpl implements LibrarianDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public User adduser(User user)  {
		user.setType("Student");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			manager.close();

		}catch(Exception e) {
			e.printStackTrace();

		}
		return user;
	}

	@Override
	public boolean deleteuser(int id) {

		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			User user = manager.find(User.class, id);
			manager.remove(user);
			manager.getTransaction().commit();

			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to delete the Student");
		}
		return true;
	}// end of deleteStudent()


	@Override
	public boolean addbook(Book book) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		try {

			transaction.begin();
			manager.persist(book);
			transaction.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Failed to add the book");
		}
		return true;
	}// end of addBooks()


	@Override
	public boolean deletebook(int bid) {

		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			Book book = manager.find(Book.class, bid);
			manager.remove(book);
			manager.getTransaction().commit();

			manager.close();
		} catch (Exception e) {
			System.out.println("Failed to delete the book from Book");
		}
		return true;
	}// end of deleteBook()



	@Override
	public boolean updatebook(Book book) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Book book1 = manager.find(Book.class, book.getBid());
		book1.setBid(book.getBid());
		book1.setBname(book.getBname());
		book1.setAuthor(book.getAuthor());
		transaction.commit();
		return true;

	}


	@Override
	public List<Book> showAllBooks() {
		List<Book> book = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<Book> query = manager.createQuery("FROM Book", Book.class);
			book = query.getResultList();
			manager.close();
		} catch (Exception e) {
			System.out.println("Failed to fetch the books from BooksInventory");
		}
		return book;
	}// end of showAllBook()





	@Override
	public List<BookReserve> viewRequest() {
		List<BookReserve> books=null;
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			TypedQuery<BookReserve> typedquery = manager.createQuery("from BookReserve", BookReserve.class);
			books = typedquery.getResultList();
			manager.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<User> showAllUsers() {
		List<User> user = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<User> query = manager.createQuery("FROM User WHERE type='student'", User.class);
			user = query.getResultList();
			manager.close();
		} catch (Exception e) {
			System.out.println("Failed to fetch the books from BooksInventory");
		}
		return user;
	}// end of showAllBook()

	@Override
	public Book getBookInfo(int bid) {
		Book book = null;
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			book = manager.find(Book.class, bid);
			transaction.commit();
			manager.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}


	@Override
	public User getStudentInfo(int id) {
		User user = null;
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			user = manager.find(User.class, id);
			transaction.commit();
			manager.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean issuebook(BookIssue bookissue) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		try {

			transaction.begin();
			manager.persist(bookissue);
			bookissue.setIssueDate(new Date());
			transaction.commit();
			manager.close();
		} catch (Exception e) {
			System.out.println("Failed to issue the book");
		}
		return true;
	}// end of addBookIssue()



	@Override
	public List<BookIssue> listofissues() {
		List<BookIssue> book = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<BookIssue> query = manager.createQuery("FROM BookIssue", BookIssue.class);
			book = query.getResultList();
			manager.close();
		} catch (Exception e) {
			System.out.println("Failed to fetch the issued books ");
		}
		return book;
	}


	@Override
	public boolean returnbook(BookIssue returnbook) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookIssue returnbooks = manager.find(BookIssue.class,returnbook);
		returnbooks.setTransactionId(returnbook.getTransactionId());
		returnbooks.setBid(returnbook.getBid());
		returnbooks.setId(returnbook.getId());
		returnbooks.setRegistrationId(returnbook.getRegistrationId());
		returnbooks.setReturnDate(returnbook.getReturnDate());
		returnbooks.setFine(returnbook.getFine());
		transaction.commit();
		return true;

	}
}

