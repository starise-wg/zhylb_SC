package com.supermap.provider.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supermap.vo.Dept;


public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
