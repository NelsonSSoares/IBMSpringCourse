package com.nelson.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nelson.spring.springjdbc.employee.dao.EmployeeDao;
import com.nelson.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nelson/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
//		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setFirstName("Nelson");
//		employee.setLastName("Soares");
		
		//int result = dao.create(employee);
		//int  result = dao.update(employee);
		//int result = dao.delete(1);
		//Employee employee = dao.read(1);
		List<Employee> result = dao.read();
		System.out.println("Number of records inserted are: "+ result);
		
	}

}
