package com.ustglobal.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.User;

import com.ustglobal.librarymanagement.service.LoginService;
@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class LoginController {
	@Autowired
	LoginService service;
	@PostMapping(path="/login/{id}/{password}",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public User login(@PathVariable("id") int id,@PathVariable("password") String password) {
		User user =null;
		try {
		 user = service.login(id, password);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Login Failed");
		}
		return user;
	}
}
