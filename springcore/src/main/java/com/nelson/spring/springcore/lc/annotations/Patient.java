<<<<<<< HEAD
package com.nelson.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
=======
package com.nelson.spring.springcore.lc.annotations;

public class Patient{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
>>>>>>> c3078950168f841781fbf2ee27f805d91100f96e
