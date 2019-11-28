package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class XMLComponentScanApp {
   public static void main(String[] args) {
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("spring.xml");	Hello hello = context.getBean(Hello.class);
	hello.setMsg("i love java");
	System.out.println(hello.getMsg());
	
	Pet pet =context.getBean(Pet.class);
	pet.setName("jackey");
	System.out.println(pet.getName());
	pet.getAnimal().makeSound();
	
	
	context.close();
}
}
