package com.donatoordep.springth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.donatoordep.springth.dto.UserDTO;
import com.donatoordep.springth.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping(value = "/register")
	public String registerpage() {
		return "register/registerUser";
	}
	
	@PostMapping(value = "/register")
	public String insert(UserDTO dto) {
		service.insert(dto);
		return "register/registerUser";
	}
	
	@GetMapping(value = "/all")
	public ModelAndView all() {
		return service.modelAll();
	}
}
