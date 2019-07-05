package com.example.demo2.repository;

import com.example.demo2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

	//查询


	User findByUserId(long account);

	User findByUserName(String userName);
	//名称类似搜索
	List<User> findByUserNameLike(String userName);

	//删除
	void deleteUserByUserName(String userName);

	void deleteUserByUserId(long id);

}
