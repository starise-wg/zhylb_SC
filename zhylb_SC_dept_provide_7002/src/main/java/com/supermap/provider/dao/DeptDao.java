package com.supermap.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.supermap.vo.Dept;

@Mapper
public interface DeptDao {
	/*添加部门的方法*/
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
