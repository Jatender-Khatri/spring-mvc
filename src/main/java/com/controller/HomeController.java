package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		System.out.println("Hello World Through Controller");
		return "helloworld";
	}
}
