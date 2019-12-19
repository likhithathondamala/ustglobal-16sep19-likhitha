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

import com.ustglobal.librarymanagement.dto.User;
import com.ustglobal.librarymanagement.service.Adminservice;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class AdminController {
	@Autowired
	Adminservice service;
	
	@PostMapping(path="/adduser",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public User addLibrarian(@RequestBody User user) {
		try {
			user = service.addLibrarian(user);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return user;
	}// end of addLibrarian()

	@DeleteMapping(path="/deletelib/{id}")
	public Boolean deleteLibrarian(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			service.deleteLibrarian(id);
			isDeleted = true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteLibrarian()
	@GetMapping(path="/displaylibrarian")
	public List<User> displayLibrarian() {
		List<User> Librarian = null;
		try {
			Librarian = service.displayLibrarian();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return Librarian;
	}// end of displayLibrarian()
}

