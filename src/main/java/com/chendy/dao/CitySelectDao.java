package com.chendy.dao;

import java.util.List;

import com.chendy.entity.CitySelect;

public interface CitySelectDao {
	public List<CitySelect> queryAll();
	public CitySelect queryCityById(Integer id);
}
