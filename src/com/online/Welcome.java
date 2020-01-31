package com.online;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Welcome {
	@RequestMapping("sayWelcome.htm")
	/*public void sayWelcome() { 
		System.out.println("Welcome");
	*/
	
	public ModelAndView sayWelcome() {
	System.out.println("Welcome");
	
	String msg="Welcome to Nepal";
	return new ModelAndView("/hello.jsp","message",msg);
		
	
	}
	
}
