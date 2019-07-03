package com.example.demo2.controller;

import com.example.demo2.model.User;
import com.example.demo2.serviceImpl.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

	@Resource
	UserService userService;


	@RequestMapping("/")
	public String index() {
		return "redirect:/list";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users=userService.getUserList();
		model.addAttribute("users", users);
		return users.get(0).getUserName();
		//return "user/list";
	}

	@RequestMapping("/toAdd")
	public int toAdd() {
		User user1 = new User();
		user1.setUserId(8752);
		user1.setUserName("aBoy");
		user1.setUserPwd("8752");
		User user2 = new User();
		user2.setUserId(8753);
		user2.setUserName("aGirl");
		user2.setUserPwd("8752");

		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);

		userService.saveAll(users);

		List<User> users1=userService.getUserList();
		return users1.size();
		//return "user/userAdd";
	}

	@RequestMapping("/add")
	public String add(User user) {
		userService.save(user);
		return "redirect:/list";
	}

	@RequestMapping("/toEdit")
	public String toEdit(Model model,Long id) {
		User user=userService.findUserById(id);
		model.addAttribute("user", user);
		return "user/userEdit";
	}



}

