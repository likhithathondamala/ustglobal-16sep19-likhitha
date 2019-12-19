package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.AdminDAO;
import com.ustglobal.librarymanagement.dto.User;
@Service
public class AdminServiceImpl  implements Adminservice{
@Autowired
	AdminDAO dao;
	@Override
	public User addLibrarian(User user) {
		
		return dao.addLibrarian(user);
	}

	@Override
	public Boolean deleteLibrarian(int id) {
	
		return dao.deleteLibrarian(id);
	}

	@Override
	public List<User> displayLibrarian() {
		
		return dao.displayLibrarian();
	}

}
