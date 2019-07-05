package com.example.demo2.service;

import com.example.demo2.model.Classify;
import com.example.demo2.repository.ClassifyRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassifyService {

	@Resource
	ClassifyRepository classifyRepository;

	List<Classify> findAllClassify(){
		return classifyRepository.findAll();
	}

	void save(Classify classify){
		classifyRepository.save(classify);
	}

	Classify findClassifyByName(String name){
		return classifyRepository.findByClassifyName(name);
	}

}
