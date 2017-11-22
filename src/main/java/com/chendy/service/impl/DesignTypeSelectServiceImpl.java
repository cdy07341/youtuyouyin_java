package com.chendy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.DesignTypeSelectDao;
import com.chendy.entity.DesignTypeSelect;
import com.chendy.service.DesignTypeSelectService;

@Service
public class DesignTypeSelectServiceImpl implements DesignTypeSelectService {
	@Autowired
	public DesignTypeSelectDao designTypeSelectDao;
	

	public List<DesignTypeSelect> queryAll() {
		return designTypeSelectDao.queryAll();
	}

}
