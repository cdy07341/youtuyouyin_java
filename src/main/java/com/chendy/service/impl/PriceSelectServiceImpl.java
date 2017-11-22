package com.chendy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.PriceSelectDao;
import com.chendy.entity.PriceSelect;
import com.chendy.service.PriceSelectService;

@Service
public class PriceSelectServiceImpl implements PriceSelectService {
	@Autowired
	public PriceSelectDao priceSelectDao;

	public List<PriceSelect> queryAll() {
		return priceSelectDao.queryAll();
	}

}
