package com.devbian.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping({"index", "/"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("user")
	public ModelAndView user(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("search");
		return modelAndView;
	}
	
	@RequestMapping("search")
	public String search() {
		return "search";
	}
	
	@RequestMapping("login")
	public String login() {
		return "account/index";
		
	}
}
