package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {
public static void main(String[] args) {
	  
	ArrayList<Integer> marks = new ArrayList<Integer>();
	marks.add(50);
	marks.add(40);
	marks.add(36);
	marks.add(57);
	marks.add(25);
	marks.add(78);
	marks.add(98);
	marks.add(63);
    Comparator<Integer> cmp = (m1 ,m2)->{
    	if(m1>m2) {
    		return 1;
    	}else if(m1<m2) {
    		return -1;
    	}else {
    		return 0;
    	}
    };
	long nooffailedStudents = marks.stream().filter(i->i<40).count();
	System.out.println( "number of failed students "+nooffailedStudents);
	System.out.println("==============");
	
	Integer i = marks.stream().min(cmp).get();
	System.out.println("min value "+i);
	
	Integer j = marks.stream().max(cmp).get();
	System.out.println("max value "+j);
	
}

}
