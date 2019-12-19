package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.UserDAO;
import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;
@Service
public class UserServiceImpl implements UserService {
@Autowired
	UserDAO dao;

	@Override
	public Book searchBook(int bid) {
		
		return dao.searchBook(bid);
	}

	@Override
	public List<Book> getall(Book book) {
		
		return dao.getall(book);
	}

	@Override
	public boolean reserve(int bid) {
		
	return dao.reserve(bid);
	}

}
