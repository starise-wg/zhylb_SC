package com.supermap.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.supermap.vo.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	public DeptClientService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new DeptClientService() {

			@Override
			public String getStr(String id) {
				// TODO Auto-generated method stub
				return "真的啥也没有！";
			}

			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String add(Dept dept) {
				// TODO Auto-generated method stub
				return null;
			}
			 
		};
	}

}
