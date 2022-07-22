package com.nelson.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}

	public void init() {
		System.out.println("Inside init method");
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
	}
	
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
