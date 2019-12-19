package com.ustglobal.librarymanagement.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookIssue;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.LibResponse;
import com.ustglobal.librarymanagement.dto.User;
import com.ustglobal.librarymanagement.service.LibrarianService;
@RestController
@CrossOrigin(origins="*",allowedHeaders="*")

public class LibrarianController {
@Autowired	
LibrarianService service;
LibResponse response = new LibResponse();

@PostMapping(path="/registeruser",consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public LibResponse adduser(@RequestBody User user) {
	
	User users = service.adduser(user);
	if(users!=null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("student added in  the DB");
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("student not added in  the DB");
	}
	return response;
	
}// end of addStudent()

@PostMapping(path="/createbook",consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public LibResponse addBooks(@RequestBody Book book) {
	      boolean books = service.addbook(book);
		if(books) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("book added in  the DB");
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not added in  the DB");
	}
	return response;
}// end of addBooks()

@DeleteMapping(path="/deletebook/{bid}",
produces = MediaType.APPLICATION_JSON_VALUE)
public LibResponse deleteBook(@PathVariable("bid") int bid) {
	

	 if(service.deletebook(bid)) {
		 response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("book delete from  the DB");
		
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not added in  the DB");
	}
return response;
}// end of deleteBook()

@GetMapping(path="/getBooks",
produces = MediaType.APPLICATION_JSON_VALUE)
public List<Book> showAllBook() {
	
	List<Book> bookList =service.showAllBooks();
	
	if(bookList!=null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("book delete from  the DB");
		response.setBook(bookList);
		
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not added in  the DB");
	}
	return bookList;
}// end of showAllBooks()

@GetMapping(path="/getStudent/{id}",
produces = MediaType.APPLICATION_JSON_VALUE)
public User getStuentInfo(@PathVariable("id")int id) {  
	User user = service.getStudentInfo(id);
	if( user!= null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("student found in  the DB");
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("student not found in  the DB");
}
	return user;
}// end of getStudentInfo()

@DeleteMapping(path="/deleteStudent/{id}",
produces = MediaType.APPLICATION_JSON_VALUE)
public LibResponse deleteuser(@PathVariable("id") int id) {
	if(service.deleteuser(id)) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("book delete from  the DB");
		 
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not added in  the DB");
	}
	return response;
}// end of deleteStudent()

@GetMapping(path="/viewRequest",
produces = MediaType.APPLICATION_JSON_VALUE)
public List<BookReserve> viewRequests() {
	List<BookReserve> reserve = service.viewRequest() ;
	if( reserve != null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("book request to  the DB");
		
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("no book found in  the DB");
	}
	
	return reserve;
}// end of viewRequest()

@GetMapping(path="/getusers",
produces = MediaType.APPLICATION_JSON_VALUE)
public List<User> showAllUser() {
	
	List<User> userList =service.showAllUsers();
	
	if(userList!=null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("show all user  in  the DB");
		response.setUser(userList);
		
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("No users are present in  the DB");
	}
	return userList;
}// end of showAllUsers()

@GetMapping(path="/getBook/{bid}",
produces = MediaType.APPLICATION_JSON_VALUE)
public Book getBookInfo(@PathVariable("id")int bid) {  
	Book book = service.getBookInfo(bid);
	if( book!= null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("book found in the DB");
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not found in  the DB");
}
	return book;
}// end of getStudentInfo()	


@PostMapping(path="/createissue",consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public LibResponse issuebook(@RequestBody BookIssue bookissue) {
	      boolean books = service.issuebook(bookissue);
		if(books) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("book added in  the DB");
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not added in  the DB");
	}
	return response;
}// end of addBooks()

@GetMapping(path="/getBookIssues",
produces = MediaType.APPLICATION_JSON_VALUE)
public List<BookIssue> listofissues() {
	
	List<BookIssue> bookissue =service.listofissues();
	
	
	if(bookissue!=null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("book delete from  the DB");
		
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not added in  the DB");
	}
	return bookissue;
}// end of showAllBooks()
@PostMapping(path="/returnbook",consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public LibResponse returnbook(@RequestBody BookIssue bookreturn) {
	      boolean bookr = service.returnbook(bookreturn);
		if(bookr) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("book added in  the DB");
	} else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("book not added in  the DB");
	}
	return response;
}// end of addBooks()

}



