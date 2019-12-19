package com.ustglobal.librarymanagement.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.librarymanagement.dto.UserResponse;

@RestControllerAdvice
public class HandlingException {
@ExceptionHandler(Exception.class)
	public UserResponse getException() {
		UserResponse response = new UserResponse();
		response.setStatuscode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}
}
