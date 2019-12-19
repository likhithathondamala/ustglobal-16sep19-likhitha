package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookIssue;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;

public interface LibrarianService {
	public User adduser(User user);
	public boolean deleteuser(int id);
	public boolean addbook(Book book);
	public boolean deletebook(int bid);
	public boolean updatebook(Book book);
	public List<Book> showAllBooks();
	public List<BookReserve> viewRequest();
	public User getStudentInfo(int id);
	public List<User> showAllUsers();
	public Book getBookInfo(int bid);
	public boolean issuebook(BookIssue bookissue);
	public List<BookIssue> listofissues();
	public boolean returnbook(BookIssue returnbook);

	
}
