package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;

public interface UserService {
	
	public Book searchBook(int bid);
	public List<Book> getall(Book book);
	public boolean reserve(int bid);

}
