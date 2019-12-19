package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
   void displayAllStudent(ArrayList<Student> al) {
	   Iterator<Student>  it = al.iterator();
	   while(it.hasNext()) {
		   Student s = it.next();
		   System.out.println("Id is " + s.id);
		   System.out.println("Name is "+s.name);
		   System.out.println("percentage is " +s.percentage);
		   System.out.println("=================");
		   
	   }
	   
	   }
//    void displayFailedStudent(ArrayList<Student> al) {
//    	List<Student> l = 
//    			al.stream().filter(student -> student.percentage < 40).collect(Collectors.toList());
//    	Iterator<Student> it = l.iterator();
//    	while(it.hasNext()) {
//    		Student s1 = it.next();
//    		System.out.println("Id is " + s1.id);
// 		   System.out.println("Name is "+s1.name);
// 		   System.out.println("percentage is " +s1.percentage);
// 		   System.out.println("=================");
//    	}
//    }
    void displayPassedStudent(ArrayList<Student> al) {
    	List<Student> l = 
    			al.stream().filter(student -> student.percentage > 40).collect(Collectors.toList());
    	Iterator<Student> it = l.iterator();
    	while(it.hasNext()) {
    		Student s1 = it.next();
    		System.out.println("Id is " + s1.id);
 		   System.out.println("Name is "+s1.name);
 		   System.out.println("percentage is " +s1.percentage);
 		   System.out.println("=================");
    	}
    }
    Comparator<Student> cmp = (s1,s2)->{
    	if(s1.percentage>s2.percentage) {
    		return 1;
    	}else if(s1.percentage<s2.percentage) {
    		return -1;
    	}else {
    		return 0;
    	}
    };
    
    void displaytopperStudent(ArrayList<Student> al) {
    	Student l = 
    			 al.stream().max(cmp).get();
    	System.out.println("Id is " + l.id);
		   System.out.println("Name is "+l.name);
		   System.out.println("percentage is " +l.percentage);

    }
}
