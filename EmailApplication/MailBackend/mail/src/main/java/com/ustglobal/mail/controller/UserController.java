package com.ustglobal.mail.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.mail.dto.Mail;
import com.ustglobal.mail.dto.User;
import com.ustglobal.mail.dto.UserResponse;
import com.ustglobal.mail.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping(path="/register",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  UserResponse addUser(@RequestBody User bean)
	{	
		User user = new User();
		UserResponse response=new UserResponse();
		if(service.register(bean)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data added to the db");
			response.setUser(Arrays.asList(bean));;
		}
		else if(user instanceof User ) {
			response.setStatuscode(402);
			response.setMessage("you are already registered..please login");
			response.setDescription("registration failed");

		}else if(bean.getUser_name().isEmpty()){
			response.setStatuscode(403);
			response.setMessage("username is required");
			response.setDescription("registration failed");
		}
		else if(bean.getPassword().length()<6){
			response.setStatuscode(402);
			response.setMessage("password should contain minimum 6 characters");
			response.setDescription("registration failed");
		}
		else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not added to the db");	
		}
		return response;
	}
	
	@PostMapping(path="/login/{email}/{password}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@PathVariable("email")String email,@PathVariable("password") String password,HttpServletRequest request) {
		UserResponse response=new UserResponse();
		if(service.login(email, password))
		{
			HttpSession session=request.getSession();
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("login successfull");
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not added to the db");	
		}
		return response;
	}

	@PostMapping(path = "/changepassword",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse ChangePassword(@RequestBody User user) {
		UserResponse response = new UserResponse();
		if(service.changePassword(user.getEmail(), user.getPassword())) {
			response.setStatuscode(201);
			response.setMessage("changed password successfully");
			response.setDescription("got successfull");
		} else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("not got successfull");	
		}
		return response;
	}

	@GetMapping(path = "/get-all-messages", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Mail> getAllMessages() {
		return service.getAllMessages();

	}
	@PostMapping(path="/compose",produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse compose(@RequestBody Mail mail) {
		UserResponse response = new UserResponse();
		if(service.compose(mail)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("compose successfull");
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("compose not  successfull");	
		}
		return response;

	}

	@DeleteMapping(path="/delete/{mid}",produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse delete(@PathVariable("mid") int mid) {
		UserResponse response = new UserResponse();
		if(service.delete(mid)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("deleted successfull");
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("not  successfull");	
		}
		return response;

	}
}
