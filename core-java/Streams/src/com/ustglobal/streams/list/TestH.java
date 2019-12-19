package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestH {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student(1,"likhi",73.43));
	al.add(new Student(2,"sai",77.83));
	al.add(new Student(3,"arun",67.89));
	al.add(new Student(4,"ABC",34.2));
	al.add(new Student(7,"raji",74.43));
	
	Helper h = new Helper();
//	h.displayAllStudent(al);
//	h.displayFailedStudent(al);
//	h.displayPassedStudent(al);
	h.displaytopperStudent(al);
	
	
	
}
}
