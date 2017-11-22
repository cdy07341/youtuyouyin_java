package com.chendy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chendy.dao.SpecialSkillDao;
import com.chendy.entity.SpecialSkill;
import com.chendy.service.SpecialSkillService;

@Service
public class SpecialSkillServiceImpl implements SpecialSkillService {
	@Autowired
	public SpecialSkillDao specialSkillDao;
	

	public List<SpecialSkill> queryAll() {
		return specialSkillDao.queryAll();
	}

}
