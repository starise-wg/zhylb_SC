package com.supermap.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

 

@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {
	
	private String deptno;
	private long dname;
	private String db_source;
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public long getDname() {
		return dname;
	}
	public void setDname(long dname) {
		this.dname = dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
}