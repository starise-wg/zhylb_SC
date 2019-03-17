package com.supermap.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermap.provider.dao.DeptDao;
import com.supermap.provider.service.DeptService;
import com.supermap.vo.Dept;
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dao;
	
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		return dao.addDept(dept);
	}

	public Dept get(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	public List<Dept> list() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
