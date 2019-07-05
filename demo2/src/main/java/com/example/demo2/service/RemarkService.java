package com.example.demo2.service;

import com.example.demo2.model.Remark;
import com.example.demo2.repository.RemarkRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RemarkService {

    @Resource
    private RemarkRepository remarkRepository ;

    public List<Remark> listByArticleId(Integer articleId) {
        return remarkRepository.findAllByArticleIdOrderByPubDate(articleId) ;
    }

    public List<Remark> listByUserId(Long userId){
        return remarkRepository.findAllByUserIdOrderByPubDate(userId);
    }

    public void deleteById(Integer id){
        remarkRepository.deleteById(id) ;
    }

    public void deleteAllByArticleId(Integer id){remarkRepository.deleteByArticleId(id);}

    public void insert(Remark remark){
        remarkRepository.save(remark);
    }
}
