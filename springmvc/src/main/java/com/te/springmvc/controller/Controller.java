package com.te.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/register")
		public String logIn() {
		return "login";
	}
}
