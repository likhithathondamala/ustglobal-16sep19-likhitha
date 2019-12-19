package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.LibrarianDAO;
import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookIssue;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;
@Service
public class LibrarianServiceImpl implements LibrarianService{
@Autowired
	LibrarianDAO dao;
	@Override
	public User adduser(User user) {
		
		return dao.adduser(user);
	}

	@Override
	public boolean deleteuser(int id) {
		
		return dao.deleteuser(id);
	}

	@Override
	public boolean addbook(Book book) {
		
		return dao.addbook(book);
	}

	@Override
	public boolean deletebook(int bid) {
		
		return dao.deletebook(bid);
	}

	@Override
	public boolean updatebook(Book book) {
		
		return dao.updatebook(book);
	}

	@Override
	public List<Book> showAllBooks() {
		
		return dao.showAllBooks();
	}

	@Override
	public List<BookReserve> viewRequest() {
		
		return dao.viewRequest();
	}

	@Override
	public User getStudentInfo(int id) {
		
		return dao.getStudentInfo(id);
	}

	@Override
	public List<User> showAllUsers() {
		
		return dao.showAllUsers();
	}

	@Override
	public Book getBookInfo(int bid) {
		return dao.getBookInfo(bid);
	}

	@Override
	public boolean issuebook(BookIssue bookissue) {
		
		return dao.issuebook(bookissue);
	}

	@Override
	public List<BookIssue> listofissues() {
		
		return dao.listofissues();
	}

	@Override
	public boolean returnbook(BookIssue returnbook) {
		
		return dao.returnbook(returnbook);
	}

}
