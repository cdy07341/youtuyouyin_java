package com.chendy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chendy.entity.YtyyUser;
import com.chendy.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		
		return "login/index";
	}
	
	@RequestMapping(value="dologin", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> doLogin(HttpServletRequest res, HttpServletResponse resp) {
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("code", 1);
		maps.put("msg", "登录成功");
		maps.put("data", "/youtuyouyin/login/welcome");
		String username = res.getParameter("userphone");
		String password = res.getParameter("password");
		
		YtyyUser user = userService.findByName(username);
		if (! user.getPassword().equals(password)) {
			maps.put("code", 0);
			maps.put("msg", "密码错误");
			return maps;
		}
		
		
		return maps;
	}
	
	@RequestMapping("welcome")
	public String welcome() {
		
		return "login/welcome";
	}

}
