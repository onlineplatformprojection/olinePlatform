package com.example.demo2.repository;

import com.example.demo2.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

	/**
	 * 根据用户ID查找购买记录，返回集合
	 * @param userId
	 * @return
	 */
	List<Purchase> findAllByUserIdOrderByPurDate(Long userId) ;

	/**
	 * 根据用户ID和课程ID查找购买记录
	 * @param userId
	 * @param courseId
	 * @return
	 */
	Purchase findByUserIdAndCourseId(Long userId,Integer courseId) ;


}
