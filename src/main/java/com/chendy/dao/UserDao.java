package com.chendy.dao;

import com.chendy.entity.YtyyUser;

public interface UserDao {
	public int add(YtyyUser user);

	public YtyyUser findByName(String username);

	public YtyyUser findById(Integer id);
}
