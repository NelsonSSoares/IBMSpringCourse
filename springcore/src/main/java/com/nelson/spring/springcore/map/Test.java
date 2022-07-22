package com.nelson.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/nelson/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("costumer");
		
		System.out.println(customer);

	}

}
