package com.chendy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chendy.entity.Print;
import com.chendy.entity.PrintTypeSelect;
import com.chendy.service.PrintService;
import com.chendy.service.PrintTypeSelectService;

@Controller
@RequestMapping("/print")
public class PrintController {
	@Autowired
	public PrintTypeSelectService printTypeSelectService;
	
	@Autowired
	public PrintService printService;
	
	@RequestMapping("/index")
	public String index() {
		//印刷类型
		List<PrintTypeSelect> printTypeSelects = printTypeSelectService.queryAll();
		//印刷
		Map<String, Object> pageInfo = new HashMap<String, Object>();
		pageInfo.put("start", 2);
		pageInfo.put("limit", 3);
		List<Print> prints = printService.queryPrintByCondition(pageInfo);
		System.out.println(prints);
		
		
		return "print/index";
	}
}
