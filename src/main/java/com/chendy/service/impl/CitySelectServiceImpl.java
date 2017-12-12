package com.chendy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.CitySelectDao;
import com.chendy.entity.CitySelect;
import com.chendy.service.CitySelectService;

@Service
public class CitySelectServiceImpl implements CitySelectService {
	@Autowired
	public CitySelectDao citySelectDao;

	public List<CitySelect> queryAllCity() {
		
		return citySelectDao.queryAll();
	}

	public CitySelect queryCityById(Integer id) {
		return citySelectDao.queryCityById(id);
	}

}
