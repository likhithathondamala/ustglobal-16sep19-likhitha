package com.ustglobal.beanobject.bean1;

import java.util.Scanner;

public class TestB {
    public static void main(String[] args) {
		System.out.println("Scanner class");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+ age);
		System.out.println("Enter name");
		String Name = sc.next();
		System.out.println("Name is "+ Name);
		System.out.println("Are you above 18 age");
		boolean y = sc.nextBoolean();
		System.out.println(y);
		
}
}
