package com.example.demo2.service;

import com.example.demo2.model.User;
import com.example.demo2.repository.UserRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

	@Resource
	private UserRepository userRepository;

	//查询
	public List<User> getUserList(){
		return userRepository.findAll();
	}

	public User findUserById(long id) {
		return userRepository.findByUserId(id);
	}


	public User getUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public List<User> getUserByUserNameLike(String userName){
		return userRepository.findByUserNameLike("%" + userName + "%");
	}

	//增加
	public void save(User user) {
		userRepository.save(user);
	}

	public void saveAll(List<User> users) {
		userRepository.saveAll(users);
	}

	//删除
	public void deleteUser(User user){
		userRepository.delete(user);
	}


	public void deleteUserById(long id) {
		userRepository.deleteUserByUserId(id);
	}

	public void deleteUserByName(String userName){
		userRepository.deleteUserByUserName(userName);
	}


}
