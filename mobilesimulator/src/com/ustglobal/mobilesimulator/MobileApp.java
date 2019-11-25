package com.ustglobal.mobilesimulator;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.mobilesimulator.dao.ContactDao;
import com.ustglobal.mobilesimulator.dto.Contactbean;
import com.ustglobal.mobilesimulator.util.ContactFactory;

public class MobileApp {
public static void main(String[] args) {
	System.out.println("Press 1 to show all contacts");
	System.out.println("Press 2 to search for contact");
	System.out.println("Press 3 to Operate on contact");
	
	Scanner scan = new Scanner(System.in);
	int ch = scan.nextInt();
	switch(ch) {
	case 1:
		ContactDao dao=  ContactFactory.getContactDao();
		List<Contactbean> result = dao.showAllContacts();
		
		for(Contactbean bean :result)
		{
			System.out.println("Id :"+bean.getName());
			System.out.println("phonenumber :"+bean.getPhoneno());
			System.out.println("Group :"+bean.getGroupname());
			System.out.println("*******************");
		}
		break;
	case 2:
		ContactDao dao2 = ContactFactory.getContactDao();
		System.out.println("Enter name to search");
		String name = scan.next();
		Contactbean bean = dao2.searchContact(name);
		if(bean!=null)
		{
			System.out.println("Name :"+bean.getName());
			System.out.println("phonenumber :"+bean.getPhoneno());
			System.out.println("Group :"+bean.getGroupname());
			System.out.println("*******************");
	
		}
		System.out.println("Press 1 to call");
		System.out.println("Press 2 to message");
		System.out.println("Press 3 to Go back");
		Scanner sc = new Scanner(System.in);
		int ch1= sc.nextInt();
		switch(ch1) {
		case 1: 
			ContactDao dao21 = ContactFactory.getContactDao();
			dao21.call();
			System.out.print(name);
		break;
		case 2:
			ContactDao dao22 = ContactFactory.getContactDao();
			dao22.message();
		break;	
		case 3:
			ContactDao dao23 = ContactFactory.getContactDao();
			dao23.goBack();
		
		break;
		}
	
		break;
	case 3:
		ContactDao dao3 = ContactFactory.getContactDao();
		dao3.operateOnContact();
		Scanner scanner = new Scanner(System.in);
		int ch3 = scanner.nextInt();
		switch (ch3) {
		case 1:
			ContactDao dao1 = ContactFactory.getContactDao();
			int a[]=dao1.insertContact();
			System.out.println(a.length+"rows inserted successfully");
			break;
		case 2:
			ContactDao dao4 = ContactFactory.getContactDao();
			int b=dao4.deleteContact();
			System.out.println(b+"rows deleted successfully");
			break;
		case 3:
			ContactDao dao5 = ContactFactory.getContactDao();
			int c=dao5.editContact();
			System.out.println(c+"rows edited successfully");
		default:
			break;
		}
	
		break;
	default:
		break;
	
	}

scan.close();
}
}
