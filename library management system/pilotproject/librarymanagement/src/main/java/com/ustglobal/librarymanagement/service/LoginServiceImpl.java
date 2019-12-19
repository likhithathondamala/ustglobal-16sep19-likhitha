package com.ustglobal.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.LoginDAO;
import com.ustglobal.librarymanagement.dto.User;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
LoginDAO dao;
	
	@Override
	public User login(int id, String password) {
		
		return dao.login(id, password);
	}

}
