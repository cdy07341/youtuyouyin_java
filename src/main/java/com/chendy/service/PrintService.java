package com.chendy.service;

import java.util.List;
import java.util.Map;

import com.chendy.entity.Print;

public interface PrintService {
	public List<Print> queryPrintByCondition(Map<String, Object> pageInfo);
}
