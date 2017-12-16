package com.chendy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.PrintDao;
import com.chendy.entity.Print;
import com.chendy.service.PrintService;

@Service
public class PrintServiceImpl implements PrintService {
	@Autowired
	public PrintDao printDao;

	public List<Print> queryAll(String type) {
		return printDao.queryAll(type);
	}


}
