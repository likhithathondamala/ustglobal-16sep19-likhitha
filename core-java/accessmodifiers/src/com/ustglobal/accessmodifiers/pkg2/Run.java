package com.ustglobal.accessmodifiers.pkg2;

public class Run {
public static void main(String[] args) {
	Demo d = new Demo();
//	System.out.println(d.a);
	//default
	System.out.println(d.b);
	d.sub();
	//protected
	System.out.println(d.d);
	d.mul();
	//public
	System.out.println(d.name);
	d.div();
}
}
