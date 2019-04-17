package com.supermap.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.supermap.provider.dao.UserDao;
import com.supermap.provider.entity.User;
import com.supermap.provider.service.UserServices;
import com.supermap.provider.util.JsonResult;
import com.supermap.provider.util.PasswordUUID;
/*业务层接口实现类*/
@Repository
public class UserServicesImpl implements UserServices {
	
	/*注入dao对象*/
	@Resource
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see com.supermap.provider.service.UserServices#checkLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public JsonResult<User> checkLogin(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override*/
	/*public JsonResult<User> checkLogin(String name, String password) {
		JsonResult<User> jsonResult = new JsonResult<User>();
		检测用户名
		User user = userDao.findByName(name);
		if(user==null) {
			jsonResult.setStatus(0);
			jsonResult.setMsg("该用户不存在");
			return jsonResult;
		}
		检测密码
		PasswordUUID uuid = new PasswordUUID();
		String pwd = uuid.md5(password);
		if(user.getUserPasssword()!= pwd) {
			jsonResult.setStatus(1);
			jsonResult.setMsg("密码错误");
			return jsonResult;
		}
		jsonResult.setStatus(200);
		jsonResult.setMsg("登录成功");
		jsonResult.setData(user);
		return jsonResult;
	}*/
	
}
