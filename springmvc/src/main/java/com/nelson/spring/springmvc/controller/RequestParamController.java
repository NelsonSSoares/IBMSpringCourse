package com.nelson.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	@RequestMapping("/showData")																//para paremetro opcional
	public ModelAndView showdata(@RequestParam("id")int id,@RequestParam("name") String name,@RequestParam(value="salary", required=false, defaultValue = "5000") double salary) {
		
		System.out.println("Id :"+ id);
		System.out.println("Name :"+ name);
		System.out.println("Salary :"+ salary);
		return new ModelAndView("userReg");
	}
}
