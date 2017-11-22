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
import com.chendy.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "register/index";
	}
	
	@RequestMapping(value="add", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> add(HttpServletRequest res, HttpServletResponse resp) {
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("code", 1);
		maps.put("msg", "注册成功");
		maps.put("data", "/youtuyouyin/login/index");
		String username = res.getParameter("userphone");
		String password = res.getParameter("password");
		String rePassword = res.getParameter("re-password");
		String phoneCode = res.getParameter("code");
		Integer intPhoneCode = Integer.parseInt(phoneCode);
		//check phone code
		if (! intPhoneCode.equals(res.getSession().getAttribute("phone_code"))) {
			maps.put("code", 0);
			maps.put("msg", "验证码错误");
			return maps;
		}
		
		if (! password.equals(rePassword)) {
			maps.put("code", 0);
			maps.put("msg", "两次密码不一致");
			return maps;
		}
		YtyyUser user = new YtyyUser(username, password);
		int a = userService.addUser(user);
		if (1 != a) {
			maps.put("code", 0);
			maps.put("msg", "注册失败");
		}
		
		return maps;
	}

}
