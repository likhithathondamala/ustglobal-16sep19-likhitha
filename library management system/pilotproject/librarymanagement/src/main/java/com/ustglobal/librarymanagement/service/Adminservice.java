package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.User;

public interface Adminservice {
	public User addLibrarian(User user)  ;
	public Boolean deleteLibrarian(int id) ;
	public List<User> displayLibrarian() ;
}
