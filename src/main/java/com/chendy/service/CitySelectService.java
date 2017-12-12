package com.chendy.service;

import java.util.List;

import com.chendy.entity.CitySelect;

public interface CitySelectService {
	public List<CitySelect> queryAllCity();
	public CitySelect queryCityById(Integer id);
}
