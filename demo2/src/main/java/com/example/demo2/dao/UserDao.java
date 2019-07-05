package com.example.demo2.dao;

import com.example.demo2.model.User;

public class UserDao {
	private User user;

	public UserDao(User user1){
		user = new User(user1.getUserId(), user1.getUserName(), user1.getUserPwd());
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
