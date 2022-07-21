package com.nelson.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/nelson/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital: "+hospital.getName());
		System.out.println("Departments: "+hospital.getDepartments().getClass());//getClass pra saber qual tipo de lista foi injetada
		

	}

}
