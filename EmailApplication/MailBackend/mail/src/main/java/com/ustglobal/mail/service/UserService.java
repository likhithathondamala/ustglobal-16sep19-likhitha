package com.ustglobal.mail.service;


import java.util.List;

import com.ustglobal.mail.dto.Mail;
import com.ustglobal.mail.dto.User;

public interface UserService {

	public boolean register(User Bean);
	public boolean login(String email,String password);
	public boolean changePassword(String email, String password);
	public List<Mail> getAllMessages();
	public boolean compose(Mail mail);
	public boolean delete(int mid);
}
