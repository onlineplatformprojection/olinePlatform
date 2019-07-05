package com.example.demo2.controller;

import com.example.demo2.model.Remark;
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
public class RemarkController {


    @Resource
    RemarkService remarkService;

    @Resource
    UserService userService ;

    @Resource
    ArticleService articleService;


    //增加评论，输入用户id，文章id，评论内容，时间由系统生成
    @RequestMapping("/remark_pub")
    public Map remark_pub(@RequestParam("userId")long userId,@RequestParam("articleId")int articleId,@RequestParam("remarkContent")String remarkContent){
        Map map = new HashMap() ;
        Remark remark = new Remark();
        remark.setUserId(userId);
        remark.setArticleId(articleId);
        remark.setRemarkContent(remarkContent);
        remark.setPubDate(new Timestamp(new Date().getTime()));
        remarkService.insert(remark);
        map.put("remarkContent",remark.getRemarkContent());

        return map;
    }

    //主要用在查看自己的历史评论，同时需要查出所评论的文章标题，评论内容和时间
    @RequestMapping("/remark_view")
    public List remark_view(@RequestParam("userId")long userId){
        List<Map> list = new ArrayList<>() ;
        List<Remark> remarkList =  remarkService.listByUserId(userId);
        Iterator<Remark> iter = remarkList.iterator();
        while(iter.hasNext()){
            Remark remark = iter.next();
            Map map = new HashMap() ;
            map.put("articleTitle", articleService.findById(remark.getArticleId()).getArticleTitle());
            map.put("remarkContent", remark.getRemarkContent());
            map.put("pubDate",remark.getPubDate()) ;
            map.put("remarkId", remark.getRemarkId());
            list.add(map) ;
        }
        return list;
    }


    //主要用在查看某个文章的历史评论，同时需要查出所评论的文章标题，评论内容和时间
    @RequestMapping("/remark_view_articleid")
    public List remark_view_articleid(@RequestParam("articleId")Integer articleId){
        List<Map> list = new ArrayList<>() ;
        List<Remark> remarkList = remarkService.listByArticleId(articleId) ;
        Iterator<Remark> iter = remarkList.iterator() ;
        Map remarkMap;
        while(iter.hasNext()){
            remarkMap = new HashMap() ;
            Remark remark = iter.next() ;
            remarkMap.put("remarkId",remark.getRemarkId()) ;
            remarkMap.put("remarkContent",remark.getRemarkContent()) ;
            remarkMap.put("userName",userService.findUserById(remark.getUserId()).getUserName()) ;
            remarkMap.put("pubDate",remark.getPubDate().getTime()) ;
            list.add(remarkMap) ;
        }
        return list ;
    }

    @RequestMapping("/remark_del")
    public Map remark_del(@RequestParam("remarkId")int remarkId){
        remarkService.deleteById(remarkId);
        Map map = new HashMap() ;
        map.put("error",0) ;
        return map ;
    }


}

