package com.chendy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.DesignerInfoDao;
import com.chendy.entity.DesignerInfo;

@Service
public class DesignerInfoServiceImpl implements DesignerInfoService {
	@Autowired
	public DesignerInfoDao designerInfoDao;

	public List<DesignerInfo> queryDesignerInfoByCondition(Map<String, Object> pageInfo) {
		return designerInfoDao.queryDesignerInfoByCondition(pageInfo);
	}

}
