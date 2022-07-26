package com.nelson.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nelson/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductList pl = (ProductList) context.getBean("productsList");
		System.out.println(pl);
		
	}

}
