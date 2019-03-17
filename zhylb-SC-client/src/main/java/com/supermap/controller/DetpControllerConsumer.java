package com.supermap.controller;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.supermap.vo.Dept;

@RestController
public class DetpControllerConsumer {

	private static final String REST_URL_PREFIX = "http://SUPERMAP-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;
	 
	@RequestMapping(value = "/consumer/dept/add")
	public String add(HttpServletRequest request){
		Dept dept = new Dept();
		dept.setDeptno(request.getParameter("key"));
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, String.class);
	}
	 
	@RequestMapping(value = "/consumer/getStr")
	public String getStr(HttpServletRequest request) throws JSONException {
		return restTemplate.getForObject(REST_URL_PREFIX + "/getStr/"+ request.getParameter("key").toString(), String.class);
	}
	
	// 测试@EnableDiscoveryClient,消费端可以调用服务发现
	@RequestMapping(value = "/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
	}
}
