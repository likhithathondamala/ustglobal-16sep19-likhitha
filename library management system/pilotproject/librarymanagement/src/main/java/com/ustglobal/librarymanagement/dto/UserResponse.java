package com.ustglobal.librarymanagement.dto;

import java.util.List;



public class UserResponse {
	private int statuscode;
	private String message;
	private String description;
	private List<Book> book;
	private List<BookIssue> bookissue;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public List<BookIssue> getBookissue() {
		return bookissue;
	}
	public void setBookissue(List<BookIssue> bookissue) {
		this.bookissue = bookissue;
	}
	
	
}
