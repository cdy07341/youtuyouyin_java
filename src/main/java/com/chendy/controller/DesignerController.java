package com.chendy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.MalformedObjectNameException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chendy.entity.CitySelect;
import com.chendy.entity.DesignTypeSelect;
import com.chendy.entity.DesignerInfo;
import com.chendy.entity.PriceSelect;
import com.chendy.entity.SpecialSkill;
import com.chendy.entity.YtyyUser;
import com.chendy.service.CitySelectService;
import com.chendy.service.DesignTypeSelectService;
import com.chendy.service.DesignerInfoService;
import com.chendy.service.PriceSelectService;
import com.chendy.service.SpecialSkillService;
import com.chendy.service.UserService;

@Controller
@RequestMapping("/designer")
public class DesignerController {
	@Autowired
	public UserService userService;
	
	@Autowired
	public CitySelectService citySelectService;
	
	@Autowired
	public DesignTypeSelectService designTypeSelectService;
	
	@Autowired
	public PriceSelectService priceSelectService;
	
	@Autowired
	public SpecialSkillService specialSkillService;
	
	@Autowired
	public DesignerInfoService designerInfoService;
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(HttpServletRequest res, HttpServletResponse resp) {
		String id = res.getParameter("id");
		YtyyUser userInfo = userService.findById(Integer.valueOf(id));
		System.out.println(userInfo);
		
		return "designer/detail";
	}

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model) {
		//city
		List<CitySelect> cityList = citySelectService.queryAllCity();
//		System.out.println(cityList);
		//design type
		List<DesignTypeSelect> designTypeSelect = designTypeSelectService.queryAll();
//		System.out.println(designTypeSelect);
		//设计价格
		List<PriceSelect> priceSelect = priceSelectService.queryAll();
//		System.out.println(priceSelect);
		//特殊技能
		List<SpecialSkill> specialSkill = specialSkillService.queryAll();
//		System.out.println(specialSkill);
		//设计师
		Map<String, Object> pageInfo = new  HashMap<String, Object>();
		pageInfo.put("start", 2);
		pageInfo.put("limit", 4);
		List<DesignerInfo> designerInfo = designerInfoService.queryDesignerInfoByCondition(pageInfo);
		
		model.addAttribute("cityList", cityList);//所在城市
		model.addAttribute("designTypeSelect", designTypeSelect);//擅长类型
		model.addAttribute("priceSelect", priceSelect);//设计价格
		model.addAttribute("specialSkill", specialSkill);//特殊技能
		
		
		return "designer/index";
	}

}
