package com.supermap.provider.service;

import com.supermap.provider.entity.User;
import com.supermap.provider.util.JsonResult;
import com.supermap.provider.util.UserResult;
/*业务层接口*/
public interface UserServices {
	//public UserResult<泛型> 方法名(根据请求参数定义);
	public JsonResult<User> checkLogin(String name,String password);
}
