package com.nelson.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/nelson/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		System.out.println("Store: " + carDealer.getName());
		System.out.println("Models: " + carDealer.getModel()/*.getClass().getName()*/);// getClass pra saber qual tipo de lista foi
																			// injetada

	}

}
