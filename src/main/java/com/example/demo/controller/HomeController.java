package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() { //직접 입력하기 때문에 void대신 String 사용 
		return "/home/main";
	}

}
