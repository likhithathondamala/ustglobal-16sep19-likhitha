package com.ustglobal.librarymanagement.controller;

import java.util.Arrays;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.Book;
import com.ustglobal.librarymanagement.dto.BookReserve;
import com.ustglobal.librarymanagement.dto.User;
import com.ustglobal.librarymanagement.dto.UserResponse;
import com.ustglobal.librarymanagement.service.UserService;



@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class UserController {
    
	@Autowired
	private UserService service;
		@GetMapping(path="/get/{bid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
public UserResponse getBook(@PathVariable("id") int bid) {
		UserResponse response = new UserResponse();
	Book bean =  service.searchBook(bid);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data found in  the DB");
			response.setBook(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not deleted to the DB");
		
		}	
		return response;
	}
		@GetMapping(path="/request/{bid}",
                                     produces = MediaType.APPLICATION_JSON_VALUE)
		public UserResponse bookResponse(@PathVariable ("bid") int bid) {
			UserResponse response = new UserResponse();
boolean request = service.reserve(bid);
			if(request ) {
				response.setStatuscode(201);
				response.setMessage("Success");
				response.setDescription("Data found in  the DB");
				
			}else {
				response.setStatuscode(401);
				response.setMessage("failure");
				response.setDescription("Data not deleted to the DB");
			
			}	
			return response;
		}
		
		
}


