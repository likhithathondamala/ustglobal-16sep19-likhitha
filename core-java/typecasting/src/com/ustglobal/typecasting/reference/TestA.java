package com.ustglobal.typecasting.reference;

public class TestA {
 public static void main(String[] args) {
	Pen p = new Pen();
	Pen p1 =  new Marker();//upcasting
	p1.write();
//	System.out.println( p1.color);
	p.write();
	
	//downcasting
	Marker m = (Marker) p1;
	System.out.println(m.size);
	m.color();
	m.write();
	
}
}
