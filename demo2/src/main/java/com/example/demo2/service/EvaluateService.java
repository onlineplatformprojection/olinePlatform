package com.example.demo2.service;

import com.example.demo2.model.Evaluate;
import com.example.demo2.repository.EvaluateRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EvaluateService {

    @Resource
    private EvaluateRepository evaluateRepository;

    public Integer deleteById(Integer id){
        return evaluateRepository.deleteByEvaId(id) ;
    }
    public List<Evaluate> listByCourseId(Integer courseId) {
        return evaluateRepository.findAllByCourseIdOrderByPubDate(courseId);
    }

    public List<Evaluate> listByUserId(Long userId){
        return evaluateRepository.findAllByUserIdOrderByPubDate(userId);
    }


}
