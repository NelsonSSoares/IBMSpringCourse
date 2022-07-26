package com.nelson.spring.springcoreadvanced.stereotypes.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Instructor {
	
	//@Value("#{T(java.lang.Math).abs(-99)}")
	//@Value("#{new Integer(77)}")
	@Value("#{new Integer(77)}")
	int id;
	
	//@Value("#{'Nelson de Sousa'.toUpperCase()}")
	@Value("#{new java.lang.String('Nelson de Sousa')}")
	String name;
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;
	
	@Value("#{5>4?true:false}")
	private boolean active;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}

	
	
	
}
