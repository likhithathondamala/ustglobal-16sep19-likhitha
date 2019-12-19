package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {
public static void main(String[] args) {
	ArrayList<Employee> al = new ArrayList<Employee>();
	Employee e1 = new Employee(1,"veera");
	Employee e2 = new Employee(2,"madhan");
	Employee e3 = new Employee(3,"balaji");
	Employee e4 = new Employee(4,"tarun");
	Employee e7 = new Employee(5,"yugandhar");
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e7);
	
	Comparator<Employee> cmp = (e5,e6)->{
		return e5.name.compareTo(e6.name);
	};
	
	List<Employee> e = al.stream().sorted(cmp).collect(Collectors.toList());
	
	Iterator<Employee> it = e.iterator();
	while(it.hasNext()) {
		Employee e11 = it.next();
		System.out.println("id is " + e11.id);
		System.out.println("name is "+e11.name);
		
	}
	
}
}
