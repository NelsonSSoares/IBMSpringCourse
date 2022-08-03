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
		
		return modelAndView;
	}

}
