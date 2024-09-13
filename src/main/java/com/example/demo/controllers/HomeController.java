package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String WelcomePage() {
		return "home";
	}

	@GetMapping("/about-us")
	public String AboutUs(Model model) {
		return "about-us";
	}

	@GetMapping("/contact-us")
	public String ContactUs() {
		return "contact-us";
	}
}