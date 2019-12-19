package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
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
	
	List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
	Iterator<Integer> it = l.iterator();
	while(it.hasNext()) {
		Integer i = it.next();
		System.out.println("sorted ------>");
		System.out.println(i);
	}
	
}
}
