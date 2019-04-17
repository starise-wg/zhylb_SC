package com.supermap.provider.controller;


import javax.annotation.Resource;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.supermap.provider.entity.User;
import com.supermap.provider.service.UserServices;
import com.supermap.provider.util.JsonResult;

@RestController /*@Restcontroller 注解=@controller + @ responseBody*/
@RequestMapping(value="/product")
public class UserController {
	@Autowired 
	private DiscoveryClient client;
	
	/*得到端口号*/
	@Value("${server.port}")  /*读取配置文件application.yml的值，格式为 @Value(${属性名})*/
	String port;
	@RequestMapping(value="/hi",method = RequestMethod.GET)
	public String home(@RequestParam String name) throws JSONException {
		/*创建一个json对象*/
		JSONObject jsonResult = new JSONObject();
		jsonResult.put("name","zhansan");
		jsonResult.put("age",100);
		return "hi"+ name +",i an from port:"+port+jsonResult;
	}
	
	/*注入userServices对象*/
	@Resource
	private UserServices userServices;
	@RequestMapping(value="/userlogin",method=RequestMethod.GET)
	public JsonResult<User> userLogin(@RequestParam String userName,String password) {
		/*调用services用来处理登录*/
		JsonResult<User> loginResult = userServices.checkLogin(userName,password);
		return loginResult;
	}
}
