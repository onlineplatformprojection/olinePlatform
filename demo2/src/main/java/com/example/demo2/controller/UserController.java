package com.example.demo2.controller;

import com.example.demo2.model.User;
import com.example.demo2.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

	@Resource
	UserService userService;

	//登录
	@RequestMapping("/logIn")
	public Map logIn(@RequestParam("userId") long userId, @RequestParam("userPwd") String userPwd){

		HashMap map = new HashMap();
		User user = userService.findUserById(userId);
		if( user.getUserPwd().equals(userPwd)){
			map.put("log_status",1);
			map.put("userId",user.getUserId());

		}else {
			map.put("log_status",0);
		}


		return map;
	}

	//随机账号注册
	@RequestMapping("/register")
	public Map register(@RequestParam("userName") String userName,@RequestParam("userPwd") String userPwd){
		HashMap map = new HashMap();
		long account;
		while (true){
			account =(int)((Math.random()*9+1)*1000);
			User user1 = userService.findUserById(account);
			if(user1 == null) break;
		}
		User user = new User(account, userName,userPwd);
		userService.save(user);
		user = userService.findUserById(account);
		if(user == null) map.put("re_true",0);
		else map.put("re_true", 1);
		return map;
	}

	//带有账号的注册
	@RequestMapping("/register_id")
	public Map register_id(@RequestParam("userId")long userId, @RequestParam("userName") String userName,@RequestParam("userPwd") String userPwd){
		HashMap map = new HashMap();
		User user = new User(userId, userName,userPwd);
		userService.save(user);
		user = userService.findUserById(userId);
		if(user == null) map.put("re_true",0);
		else map.put("re_true", 1);
		return map;
	}

}

