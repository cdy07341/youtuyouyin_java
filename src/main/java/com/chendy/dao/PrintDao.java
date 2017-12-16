package com.chendy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PrintDao {
	public List<com.chendy.entity.Print> queryAll(@Param("type") String type);
}
