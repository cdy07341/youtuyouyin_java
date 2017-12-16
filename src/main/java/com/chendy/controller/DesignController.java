package com.chendy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/design")
public class DesignController {

	@RequestMapping("/index")
	public String index(Model model) {
		
		
		return "design/index";
	}
}
