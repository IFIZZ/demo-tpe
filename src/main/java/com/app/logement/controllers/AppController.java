package com.app.logement.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
	 return "index2";
	}
	
	
}
