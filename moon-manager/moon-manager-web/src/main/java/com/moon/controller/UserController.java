package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.common.pojo.MoonResult;
import com.moon.pojo.TbUser;
import com.moon.service.UserService;

/*
 * 用户管理Controller
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/*
	 * @ResponseBoby会返回json格式的数据
	 */
	@RequestMapping("/user/{username}")
	@ResponseBody
	public MoonResult getUserById(@PathVariable String username){
		return userService.getUserById(username);
	}
	

}
