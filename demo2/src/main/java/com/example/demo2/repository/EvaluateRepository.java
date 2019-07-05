package com.example.demo2.repository;

import com.example.demo2.model.Evaluate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EvaluateRepository extends JpaRepository<Evaluate, Integer> {


	/**
	 * 搜索课程ID查找评价并按日期排序
	 * @return
	 */
	Integer deleteByEvaId(Integer id) ;

	List<Evaluate> findAllByCourseIdOrderByPubDate(Integer courseId) ;

	/**
	 * 根据用户Id查找评价,按日期排序
	 * @param userId
	 * @return
	 */
	List<Evaluate> findAllByUserIdOrderByPubDate(Long userId);

	List<Evaluate> findAllByCourseId(int courseId);

}
