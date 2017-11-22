package com.chendy.service;

import java.util.List;
import java.util.Map;

import com.chendy.entity.DesignerInfo;

public interface DesignerInfoService {
	public List<DesignerInfo> queryDesignerInfoByCondition(Map<String, Object> pageInfo); 
}
