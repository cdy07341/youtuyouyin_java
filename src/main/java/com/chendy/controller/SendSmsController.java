package com.chendy.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sendsms")
public class SendSmsController {
	private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> index(HttpServletRequest res, HttpServletResponse resp) {
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("code", 1);
		maps.put("msg", "发送成功");
		maps.put("data", "");
		//check validate code
		String validateCode = (String) res.getSession().getAttribute("register_code");
		System.out.println(validateCode);
		System.out.println(res.getParameter("code"));
		if (! validateCode.equals(res.getParameter("code"))) {
			maps.put("code", 0);
			maps.put("msg", "验证码错误");
			return maps;
		}
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(Url);

		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");

		int mobile_code = (int)((Math.random()*9+1)*100000);

	    String content = new String("优图优印提醒您，用户" + mobile_code + "提交了设计需求哦，请在30分钟内联系。");

		NameValuePair[] data = {//提交短信
			    new NameValuePair("account", "cf_yinba"), 
			    new NameValuePair("password", "49b7427404ca7d737389983587caae97"), //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
			    //new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
			    new NameValuePair("mobile", "17721391015"), 
			    new NameValuePair("content", content),
		};
		method.setRequestBody(data);

		try {
			client.executeMethod(method);
			
			String SubmitResult =method.getResponseBodyAsString();

			Document doc = DocumentHelper.parseText(SubmitResult);
			Element root = doc.getRootElement();

			String code = root.elementText("code");
			 if(!("2".equals(code))) {
				maps.put("code", 0);
				maps.put("msg", "发送失败");
			}
			 //存到session里面
			 res.getSession().setAttribute("phone_code", mobile_code);
		} catch (HttpException e) {
			maps.put("code", 0);
			maps.put("msg", "发送失败");
		} catch (IOException e) {
			maps.put("code", 0);
			maps.put("msg", "发送失败");
		} catch (DocumentException e) {
			maps.put("code", 0);
			maps.put("msg", "发送失败");
		}
		
		return maps;
	}
}
