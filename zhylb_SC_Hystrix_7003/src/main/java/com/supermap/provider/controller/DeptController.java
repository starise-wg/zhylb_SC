package com.supermap.provider.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.supermap.vo.Dept;

@RestController
public class DeptController {
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value="/getStr/{str}")
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public String getStr(@PathVariable("str") String str){
		if (str.equals("123")) {
			throw new RuntimeException("该ID：" + str + "没有没有对应的信息");
		}
		return "8001ready" + str;
	}
	@RequestMapping(value="/getStrs/{str}")
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public String getStrs(@PathVariable("str") String str){
		if (str.equals("123")) {
			throw new RuntimeException("该ID：" + str + "没有没有对应的信息");
		}
		return "8001ready" + str;
	}
	public String processHystrix_Get(@PathVariable("str") String str)
	{
		return "没东西";
	}
	
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public String add(@RequestBody Dept dept){
		return "Dept-8001ready"+dept.getDeptno();
	}
	 
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = client.getInstances("SUPERMAP-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t"
					+ element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}
}
