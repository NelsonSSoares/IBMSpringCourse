package com.nelson.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	public Employee(Address address){
		this.address = address;
	}
	@Autowired(required = false)// caso o bean com o qualifier nao seja encontrado, injetara valor nulo
	@Qualifier("address2") // o autowire procura o bean com o nome especifico
	private Address address;


	public Address getAddress() {
		return address;
	}
	//@Autowired // pode ser injetado tambem no construtor e na declaração do campo
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
}
