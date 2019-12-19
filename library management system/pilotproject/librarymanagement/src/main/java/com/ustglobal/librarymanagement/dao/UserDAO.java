package com.ustglobal.librarymanagement.dao;

import java.util.List;

import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;

public interface UserDAO {

public Book searchBook(int bid);
public List<Book> getall(Book book);
public boolean reserve(int bid);
}
