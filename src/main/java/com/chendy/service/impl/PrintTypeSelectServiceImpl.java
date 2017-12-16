package com.chendy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.PrintTypeSelectDao;
import com.chendy.entity.PrintTypeSelect;
import com.chendy.service.PrintTypeSelectService;

@Service
public class PrintTypeSelectServiceImpl implements PrintTypeSelectService {
	@Autowired
	public PrintTypeSelectDao printTypeSelectDao;
	

	public List<PrintTypeSelect> queryAll(Integer id) {
		return printTypeSelectDao.queryAll(id);
	}

}
