package com.chendy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/designerapply")
public class DesignerApplyController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(HttpServletRequest res, HttpServletResponse resp) {
		
		return "designerapply/index";
	}

}
