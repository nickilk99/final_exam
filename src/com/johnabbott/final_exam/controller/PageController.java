package com.johnabbott.final_exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.final_exam.model.UserEntity;
import com.johnabbott.final_exam.service.UserService;

@Controller
public class PageController {
	
	@Autowired
	UserService service;

	@RequestMapping("/")
	public ModelAndView goLogin2(@ModelAttribute("user") UserEntity usr) {
		ModelAndView modelView = new ModelAndView("login");
		modelView.addObject("user", new UserEntity());
		return modelView;
	}
	

	@RequestMapping("home")
	public ModelAndView goHome() {
		ModelAndView modelView = new ModelAndView("index");
		return modelView;
	}
	
	@RequestMapping("register")
	public ModelAndView goRegister(@ModelAttribute("user") UserEntity usr) {
		ModelAndView modelView = new ModelAndView("register");
		modelView.addObject("user", new UserEntity());
		return modelView;
	}
	
	@RequestMapping("login")
	public ModelAndView goLogin(@ModelAttribute("user") UserEntity usr) {
		ModelAndView modelView = new ModelAndView("login");
		modelView.addObject("user", new UserEntity());
		return modelView;
	}
	
	
	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String createPost(@ModelAttribute("user") UserEntity user) {
		if (service.addUser(user)) {
			System.out.println("success");
			return "redirect:/login";
			}
		else {
			System.out.println("success");
			return "redirect:/login";
		}
	}
	
	
	@RequestMapping(value = "validate", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") UserEntity usr) {

		
		return service.validate(usr);
	}
	
	
}
