package com.chendy.service;

import java.util.List;

import com.chendy.entity.Print;

public interface PrintService {
	public List<Print> queryAll(String type);
}
