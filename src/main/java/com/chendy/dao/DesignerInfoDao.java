package com.chendy.dao;

import java.util.List;
import java.util.Map;

import com.chendy.entity.DesignerInfo;

public interface DesignerInfoDao {
	public List<DesignerInfo> queryDesignerInfoByCondition(Map<String, Object> pageInfo);
	public List<DesignerInfo> queryDesignerByRecommend(Map<String, Object> pageInfo);
}
