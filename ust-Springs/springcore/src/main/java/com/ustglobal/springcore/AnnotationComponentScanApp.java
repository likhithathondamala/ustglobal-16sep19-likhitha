package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ComponentscanConfiguration;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationComponentScanApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentscanConfiguration.class);
	
	Hello hello = context.getBean(Hello.class);
	hello.setMsg("i love python");
	System.out.println(hello.getMsg());
	
	Pet pet = context.getBean(Pet.class);
	pet.setName("meow");
	System.out.println(pet.getName());
	pet.getAnimal().makeSound();
	
	context.close();
}
}
