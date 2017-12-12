package com.chendy.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.DesignerInfoAllDao;
import com.chendy.dao.DesignerInfoDao;
import com.chendy.entity.DesignerInfo;
import com.chendy.entity.DesignerInfoAll;
import com.chendy.service.DesignerInfoService;

@Service
public class DesignerInfoServiceImpl implements DesignerInfoService {
	@Autowired
	public DesignerInfoDao designerInfoDao;
	
	@Autowired
	public DesignerInfoAllDao designerInfoAllDao;

	public List<DesignerInfo> queryDesignerInfoByCondition(Map<String, Object> pageInfo) {
		return designerInfoDao.queryDesignerInfoByCondition(pageInfo);
	}
	
	public List<DesignerInfo> queryDesignerByRecommend(Map<String, Object> pageInfo) {
		return designerInfoDao.queryDesignerByRecommend(pageInfo);
	}
	
	public List<DesignerInfoAll> queryDesignerInfoAll(String city, Integer type, Integer price, Integer skill) {
		return designerInfoAllDao.queryDesignerAssociation(city, type, price, skill);
	}

	public Integer queryDesignerAssociationTotal() {
		return designerInfoAllDao.queryDesignerAssociationTotal();
	}

}
