package com.chendy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.chendy.entity.DesignerInfoAll;
import com.chendy.entity.PriceSelect;
import com.chendy.entity.SpecialSkill;
import com.chendy.entity.YtyyUser;
import com.chendy.service.CitySelectService;
import com.chendy.service.DesignTypeSelectService;
import com.chendy.service.DesignerInfoService;
import com.chendy.service.PriceSelectService;
import com.chendy.service.SpecialSkillService;
import com.chendy.service.UserService;
import com.chendy.util.Util;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	
	@Autowired
	public Util util;
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(HttpServletRequest res, HttpServletResponse resp) {
		String id = res.getParameter("id");
		YtyyUser userInfo = userService.findById(Integer.valueOf(id));
		System.out.println(userInfo);
		
		return "designer/detail";
	}

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model,HttpServletRequest request) {
		Map<String, String[]> params = request.getParameterMap();
		Map<String, String> selectedUrl = new HashMap<String, String>();
		String cityUrl = ""; 
		String cityLink = "?";
		String typeUrl = "";
		String typeLink = "?";
		String priceUrl = "";
		String priceLink = "?";
		String skillUrl = "";
		String skillLink = "?";
		for (Map.Entry<String, String[]> entry : params.entrySet()) {  
		    String key = entry.getKey();
		    selectedUrl.put(key, params.get(key)[0]);
		    if (!key.equals("city")) {
				if (cityUrl.equals("")) {
					cityUrl += "?" + key + "=" + params.get(key)[0];
				} else {
					cityUrl += "&" + key + "=" + params.get(key)[0];
				}
				cityLink = "&";
			}
		    if (!key.equals("type")) {
		    	if (typeUrl.equals("")) {
		    		typeUrl += "?" + key + "=" + params.get(key)[0];
		    	} else {
		    		typeUrl += "&" + key + "=" + params.get(key)[0];
		    	}
		    	typeLink = "&";
		    }
		    if (!key.equals("price")) {
		    	if (priceUrl.equals("")) {
		    		priceUrl += "?" + key + "=" + params.get(key)[0];
		    	} else {
		    		priceUrl += "&" + key + "=" + params.get(key)[0];
		    	}
		    	priceLink = "&";
		    }
		    if (!key.equals("skill")) {
		    	if (skillUrl.equals("")) {
		    		skillUrl += "?" + key + "=" + params.get(key)[0];
		    	} else {
		    		skillUrl += "&" + key + "=" + params.get(key)[0];
		    	}
		    	skillLink = "&";
		    }
		}
		
		//city
		List<CitySelect> cityList = citySelectService.queryAllCity();
		//design type
		List<DesignTypeSelect> designTypeSelect = designTypeSelectService.queryAll();
		//设计价格
		List<PriceSelect> priceSelect = priceSelectService.queryAll();
		//特殊技能
		List<SpecialSkill> specialSkill = specialSkillService.queryAll();
		//查询城市名称
		String strCity = "";
		Integer cityId = 0;
		if (selectedUrl.get("city") == null) {
		} else {
			cityId = Integer.valueOf(selectedUrl.get("city"));
			CitySelect city = citySelectService.queryCityById(cityId);
			strCity = city.getCity();
		}
		//type
		Integer type = 0;
		if (selectedUrl.get("type") != null) {
			type = Integer.valueOf(selectedUrl.get("type"));
		}
		Integer price = 0;
		if (selectedUrl.get("price") != null) {
			price = Integer.valueOf(selectedUrl.get("price"));
		}
		Integer skill = 0;
		if (selectedUrl.get("skill") != null) {
			skill = Integer.valueOf(selectedUrl.get("skill"));
		}
		
		//分页
		Integer page = request.getParameter("page") != "" && request.getParameter("page") != null ? Integer.parseInt(request.getParameter("page")) : 1;
		Integer pageSize = 10;
		PageHelper.startPage(page, pageSize);
		List<DesignerInfoAll> designerInfoAll = designerInfoService.queryDesignerInfoAll(strCity, type, price, skill);
		//用PageInfo对结果进行包装
		PageInfo<DesignerInfoAll> objPage = new PageInfo<DesignerInfoAll>(designerInfoAll);
	  
		//专栏推荐
		Map<String, Object> recommendPageInfo= new HashMap<String, Object>();
		recommendPageInfo.put("start", 0);
		recommendPageInfo.put("limit", 15);
		List<DesignerInfo> recommendDesignerList = designerInfoService.queryDesignerByRecommend(recommendPageInfo);
		
		String strParams = util.generateStrParams(request.getParameterMap());
		
		model.addAttribute("objPage", objPage); 
		model.addAttribute("cityList", cityList);//所在城市
		model.addAttribute("designTypeSelect", designTypeSelect);//擅长类型
		model.addAttribute("priceSelect", priceSelect);//设计价格
		model.addAttribute("specialSkill", specialSkill);//特殊技能
		model.addAttribute("recommendDesignerList", recommendDesignerList);//专栏推荐
		model.addAttribute("designerInfoAll", designerInfoAll);//设计师
		model.addAttribute("cityUrl", cityUrl);
		model.addAttribute("cityLink", cityLink);
		model.addAttribute("typeUrl", typeUrl);
		model.addAttribute("typeLink", typeLink);
		model.addAttribute("priceUrl", priceUrl);
		model.addAttribute("priceLink", priceLink);
		model.addAttribute("skillUrl", skillUrl);
		model.addAttribute("skillLink", skillLink);
		model.addAttribute("cityId", cityId);
		model.addAttribute("type", type);
		model.addAttribute("price", price);
		model.addAttribute("skill", skill);
		model.addAttribute("strParams", strParams);
		
		return "designer/index";
	}

}
