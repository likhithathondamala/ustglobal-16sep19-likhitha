package com.ustglobal.librarymanagement.dao;

import java.util.List;

import com.ustglobal.librarymanagement.dto.User;

public interface AdminDAO {
	public User addLibrarian(User user)  ;
	public Boolean deleteLibrarian(int id) ;
	public List<User> displayLibrarian() ;
}
