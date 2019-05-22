package com.bjsxt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userServiceImpl;
	
	@RequestMapping("login")
	@ResponseBody
	public User isLogin(User user1) {
		//ÓÃ»§µÇÂ¼
		User user2 = userServiceImpl.findUser(user1);
		System.out.println(user2);
		return user2;
	}
}
