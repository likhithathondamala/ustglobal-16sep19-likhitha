package com.ustglobal.beanobject.bean1;

public class Database {
    void receive(Employee e) {
    	System.out.println("id is "+ e.getId());
    	System.out.println("salary is "+ e.getSalary());
    	System.out.println("Name is "+ e.getName());
    	System.out.println("Department is " + e.getDepartment());
    	System.out.println("Designation is "+ e.getDesignation());
    }
}
