package com.chendy.service;

import com.chendy.entity.YtyyUser;

public interface UserService {
	public int addUser(YtyyUser user);

	public YtyyUser findByName(String username);

	public YtyyUser findById(Integer id);
}
