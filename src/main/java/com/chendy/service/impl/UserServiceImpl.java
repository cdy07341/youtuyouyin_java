package com.chendy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.UserDao;
import com.chendy.entity.YtyyUser;
import com.chendy.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public int addUser(YtyyUser user) {
		return userDao.add(user);
	}
	
	public YtyyUser findByName(String username) {
		return userDao.findByName(username);
	}

	public YtyyUser findById(Integer id) {
		return userDao.findById(id);
	}

	
}
