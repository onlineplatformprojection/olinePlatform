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

	public List<Classify> findAllClassify(){
		return classifyRepository.findAll();
	}

	public void save(Classify classify){
		classifyRepository.save(classify);
	}

	public Classify findClassifyByName(String name){
		return classifyRepository.findByClassifyName(name);
	}

	public boolean exitClassifyByName(String name){
		return classifyRepository.existsByClassifyName(name);
	}

}
