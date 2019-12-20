package com.ustglobal.hasarelation;

public class TestA {
   public static void main(String[] args) {
	Person p = new Person();
	System.out.println(p.name);
	
	p.sleep();
	p.eat();
	System.out.println("=====================");
	System.out.println(p.m.size);//Has-A Relation
	System.out.println(p.m.name);
}
}
