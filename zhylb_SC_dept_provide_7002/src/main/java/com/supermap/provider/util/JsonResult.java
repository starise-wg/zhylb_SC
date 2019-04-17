package com.supermap.provider.util;

import java.io.Serializable;

/*json 返回工具类*/
//{"status":xx,"msg":xxx,"data":xxx}  返回格式
public class JsonResult<T> implements Serializable {
	
	private int status; /*返回状态码*/
	private String msg;  /*返回消息*/
	private T data;  /*返回数据*/
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
