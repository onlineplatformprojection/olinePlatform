package com.example.demo2.repository;

import com.example.demo2.model.Remark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;


public interface RemarkRepository extends JpaRepository<Remark, Integer> {

	/**
	 * 搜索文章ID查找评论并按日期排序
	 * @return
	 */

	void deleteById(Integer id) ;

	List<Remark> findAllByArticleIdOrderByPubDate(Integer articleId) ;

	/**
	 * 根据用户Id查找评论,按日期排序
	 * @param userId
	 * @return
	 */
	List<Remark> findAllByUserIdOrderByPubDate(Long userId) ;

	@Transactional
	@Query(value = "delete from remark where A_id=?1", nativeQuery = true)
	@Modifying
	void deleteByArticleId(Integer id);

}
