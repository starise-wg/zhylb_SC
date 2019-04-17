package com.supermap.provider.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.supermap.provider.entity.User;

/*mapper层*/
@Mapper
public interface UserDao {
	
	public Map<String,Object> findByName(String name);
}
