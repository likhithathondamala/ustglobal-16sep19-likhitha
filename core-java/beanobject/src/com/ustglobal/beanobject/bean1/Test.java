package com.ustglobal.beanobject.bean1;

public class Test {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setId(12);
	e.setSalary(30000);
	e.setName("likhi");
	e.setDepartment("abc");
	e.setDesignation("developer");
	
	
	Database db1 = new Database();
	db1.receive(e);
}
}
