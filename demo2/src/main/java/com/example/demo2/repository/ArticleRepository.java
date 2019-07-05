package com.example.demo2.repository;

import com.example.demo2.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArticleRepository extends JpaRepository<Article, Integer> {


	/**
	 * 搜索全部文章并按发布日期排序
	 * @return
	 */
	List<Article> findAllByOrderByPubDate() ;

	/**
	 * 根据关键字搜索文章并按发布日期排序
	 * @param keyWord
	 * @return
	 */
	List<Article> findAllByArticleTitleLikeOrderByPubDate(String keyWord) ;

	void deleteByArticleId(Integer id) ;

	List<Article> findAllByUserId(Long userId) ;

	List<Article> findAllByArticleClassifyLike(String name);

}
