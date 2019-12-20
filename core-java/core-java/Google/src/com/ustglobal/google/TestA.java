package com.ustglobal.google;

public class TestA {
   public static void main(String[] args) {
	   Browser b = new Browser();
	     Google gm = new Gmail();
	     b.open(gm);
	     
	     Google gd = new GoogleDrive();
	     b.open(gd);
	     
}
}
