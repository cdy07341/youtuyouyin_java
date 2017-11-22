package com.chendy.dao;

import java.util.List;
import java.util.Map;

public interface PrintDao {
	public List<com.chendy.entity.Print> queryByCondition(Map<String, Object> pageInfo);
}
