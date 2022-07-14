package com.nelson.spring.springcore.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/nelson/spring/springcore/refTypes/refconfig.xml");
		Students student = (Students) context.getBean("student");

		System.out.println(student);

	}

}
