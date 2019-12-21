package com.ustglobal.mail.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ustglobal.mail.dto.Mail;
import com.ustglobal.mail.dto.User;

@Repository
public interface UserDao {

	public boolean register(User Bean);
	public boolean login(String email,String password);
	public boolean changePassword(String email, String password);
	public List<Mail> getAllMessages();
	public boolean compose(Mail mail);
	public boolean delete(int mid);
}
