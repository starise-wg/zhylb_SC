package com.supermap.provider.entity;

import java.io.Serializable;

/**
 * 参考相关表定义
 * -属性名与字段名一致
 * -属性类型与字段类型一致
 * -实现序列化
 */
public class Detp implements Serializable{
	private String name;
	private String addr;
	private int Deptno;
	public int getNo() {
		return Deptno;
	}
	public void setNo(int no) {
		this.Deptno = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
