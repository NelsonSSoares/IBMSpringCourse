/**
 * 
 */
package com.nelson.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 015081631
 *
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Nelson");
		modelAndView.addObject("salary", 10000);
		return modelAndView;
	}

}
