package com.ustglobal.beanobject.bean;

public class TestA {
  public static void main(String[] args) {
	Student s = new Student();
	s.setId(12);
	s.setName("likhitha");
	s.setmobno(22323344);
	
	
	Database db = new Database();
	db.receive(s);
}
}
