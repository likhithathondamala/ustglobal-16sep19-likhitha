package com.ustglobal.librarymanagement.dao;

import com.ustglobal.librarymanagement.dto.User;

public interface LoginDAO {
  public User login(int id,String password);
}
