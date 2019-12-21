package com.ustglobal.mail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ustglobal.mail.dao.UserDao;
import com.ustglobal.mail.dto.Mail;
import com.ustglobal.mail.dto.User;

@Service 
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao;

	@Override
	public boolean register(User Bean) {
		// TODO Auto-generated method stub
		return dao.register(Bean);
	}

	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return dao.login(email, password);
	}
	
	@Override
	public boolean changePassword(String email, String password) {

		return dao.changePassword(email, password);
	}
	
	@Override
	public List<Mail> getAllMessages() {
		
		return dao.getAllMessages();
	}

	@Override
	public boolean compose(Mail mail) {
		// TODO Auto-generated method stub
		return dao.compose(mail);
	}

	@Override
	public boolean delete(int mid) {
		// TODO Auto-generated method stub
		return dao.delete(mid);
	}


}
