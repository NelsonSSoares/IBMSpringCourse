package com.nelson.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/nelson/spring/springcore/properties/propsconfig.xml");
		CountryAndLanguages countryAndLang = (CountryAndLanguages) context.getBean("countryAndLangs");

		System.out.println(countryAndLang);

	}

}
