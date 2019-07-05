package com.example.demo2.service;

import com.example.demo2.model.Article;

import com.example.demo2.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService {

    @Resource
    private ArticleRepository articleRepository ;

    public List<Article> list() {
        return articleRepository.findAllByOrderByPubDate() ;
    }

    public List<Article> listByKeyWord(String keyWord){
        return articleRepository.findAllByArticleTitleLikeOrderByPubDate("%"+keyWord+"%") ;
    }

    public void deleteById(Integer id){
        articleRepository.deleteById(id) ;
    }

    public Article findById(Integer id){
        return articleRepository.findById(id).get() ;
    }

    public List<Article> findAllByUserId(Long userId){
        return articleRepository.findAllByUserId(userId) ;
    }
    public void insert(Article article){
        articleRepository.save(article);
    }
}
