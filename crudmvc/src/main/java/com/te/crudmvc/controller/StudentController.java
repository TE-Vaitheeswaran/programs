package com.te.crudmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/login")
	public String register() {
		return "signup";
	}
}
