package com.ustglobal.atmmachine;

public class TestA {
public static void main(String[] args) {
	HDFC h1 = new HDFC();
	Machine m = new Machine();
	m.slot(h1);
	ICICI i1 = new ICICI();
	m.slot(i1);
	SBI s = new SBI();
	m.slot(s);
}
}
