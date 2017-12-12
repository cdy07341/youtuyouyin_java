package com.chendy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chendy.entity.DesignerInfoAll;

public interface DesignerInfoAllDao {
	public List<DesignerInfoAll> queryDesignerAssociation(@Param("city") String city, @Param("type") Integer type, @Param("price") Integer price, @Param("skill") Integer skill);
	public Integer queryDesignerAssociationTotal();
}
