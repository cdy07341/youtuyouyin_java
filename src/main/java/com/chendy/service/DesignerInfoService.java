package com.chendy.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.chendy.entity.DesignerInfo;
import com.chendy.entity.DesignerInfoAll;

public interface DesignerInfoService {
	public List<DesignerInfo> queryDesignerInfoByCondition(Map<String, Object> pageInfo); 
	public List<DesignerInfo> queryDesignerByRecommend(Map<String, Object> pageInfo); 
	public List<DesignerInfoAll> queryDesignerInfoAll(String city, Integer type, Integer price, Integer skil);
	public Integer queryDesignerAssociationTotal();
}
