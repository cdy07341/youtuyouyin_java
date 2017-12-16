package com.chendy.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chendy.entity.Print;
import com.chendy.entity.PrintTypeSelect;
import com.chendy.service.PrintService;
import com.chendy.service.PrintTypeSelectService;
import com.chendy.util.Util;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/print")
public class PrintController {
	@Autowired
	public PrintTypeSelectService printTypeSelectService;

	@Autowired
	public PrintService printService;
	
	@Autowired
	public Util util;

	@RequestMapping("/index")
	public String index(Model model, HttpServletRequest request) {
		String type = request.getParameter("type");
		Map<String, String[]> params = request.getParameterMap();
		//参数
		String strParams = util.generateStrParams(params);
		
		// 印刷类型
		List<PrintTypeSelect> printTypeSelects = printTypeSelectService.queryAll(Integer.getInteger(type));
		// 印刷
		// 分页
		Integer page = request.getParameter("page") != "" && request.getParameter("page") != null ? Integer.parseInt(request.getParameter("page")) : 1;
		Integer pageSize = 16;
		PageHelper.startPage(page, pageSize);
		List<Print> prints = printService.queryAll(type);
		PageInfo<Print> objPage = new PageInfo<Print>(prints);
		
		model.addAttribute("printTypeSelects", printTypeSelects);
		model.addAttribute("type", type);
		model.addAttribute("objPage", objPage);
		model.addAttribute("prints", prints);
		model.addAttribute("strParams", strParams);
		
		return "print/index";
	}
}
