package com.example.demo2.controller;


import com.example.demo2.model.Article;
import com.example.demo2.model.User;
import com.example.demo2.service.ArticleService;
import com.example.demo2.service.RemarkService;
import com.example.demo2.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.*;

@RestController
public class ArticleController {
    @Resource
    ArticleService articleService ;
    @Resource
    UserService userService ;
    @Resource
    RemarkService remarkService ;


    @RequestMapping("/article_pub")
    public Map articlePub(@RequestParam("userId")long userId, @RequestParam("title")String title,@RequestParam("articleContent")String articleContent){
        Map map = new HashMap() ;
        Article article = new Article();
        article.setUserId(userId);
        article.setArticleTitle(title);
        article.setArticleContent(articleContent);
        article.setPubDate(new Timestamp(new Date().getTime()));
        User user = userService.findUserById(userId) ;
        articleService.insert(article);
        map.put("title",title) ;
        map.put("userName",user.getUserName()) ;
        map.put("articleContent",articleContent) ;
        return map;
    }
    @RequestMapping("/article")
    public List<Map> articleList(){
        List<Map> list = new ArrayList<>() ;
        List<Article> articleList = articleService.list() ;
        Iterator<Article> iter = articleList.iterator() ;
        while(iter.hasNext()){
                Article article = iter.next();
                User user = userService.findUserById(article.getUserId()) ;
                Map map = new HashMap() ;
                map.put("title",article.getArticleTitle());
                map.put("userName",user.getUserName()) ;
                map.put("articleId",article.getArticleId()) ;
                map.put("pubDate",article.getPubDate().getTime()) ;
                list.add(map) ;
        }
        return list ;
    }
    @RequestMapping("/article_srh")
    public Map articleSearch(@RequestParam("keyWord")String keyWord){
        Map mymap = new HashMap() ;
        List<Map> list = new ArrayList<>() ;
        List<Article> articleList = articleService.listByKeyWord(keyWord) ;
        if(articleList.size() != 0) {
            Iterator<Article> iter = articleList.iterator();
            while (iter.hasNext()) {
                Article article = iter.next();
                User user = userService.findUserById(article.getUserId());
                Map map = new HashMap();
                map.put("title", article.getArticleTitle());
                map.put("userName", user.getUserName());
                map.put("articleId",article.getArticleId()) ;
                map.put("pubDate",article.getPubDate().getTime()) ;
                list.add(map);
            }
            mymap.put("srh_true",1) ;
            mymap.put("article",list) ;
        } else {
            mymap.put("srh_true",0) ;
        }
        return mymap ;
    }
    @RequestMapping("/article_target")
    public Map articleTarget(@RequestParam("articleId")Integer articleId){
        Map mymap = new HashMap() ;
        Article article = articleService.findById(articleId) ;
        mymap.put("title",article.getArticleTitle()) ;
        mymap.put("userName",userService.findUserById(article.getUserId()).getUserName()) ;
        mymap.put("articleContent",article.getArticleContent()) ;
        mymap.put("pubDate",article.getPubDate().getTime()) ;
        return mymap ;
    }
    @RequestMapping("/article_per")
    public List articlePer(@RequestParam("userId")Long userId){
        List<Map> list = new ArrayList<>() ;
        List<Article> articleList = articleService.findAllByUserId(userId) ;
        Iterator<Article> iter = articleList.iterator();
        while(iter.hasNext()){
            Map map = new HashMap() ;
            Article article = iter.next() ;
            map.put("title",article.getArticleTitle()) ;
            map.put("articleId",article.getArticleId()) ;
            map.put("pubDate",article.getPubDate().getTime()) ;
            list.add(map) ;
        }
        return list ;
    }
    @RequestMapping("/article_del")
    public Map articleDel(@RequestParam("articleId")Integer articleId){
        remarkService.deleteAllByArticleId(articleId);
        articleService.deleteById(articleId) ;
        Map map = new HashMap() ;
        map.put("error",0) ;
        return map ;
    }
}
