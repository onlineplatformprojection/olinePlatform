package com.example.demo2.controller;

import com.example.demo2.model.Classify;
import com.example.demo2.repository.ClassifyRepository;
import com.example.demo2.service.ClassifyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ClassifyController {

	@Resource
	ClassifyService classifyService;

	@RequestMapping("/classify")
	public List<String> classify(){
		List<Classify> classifyList = classifyService.findAllClassify();
		List<String> stringList = new ArrayList<>();
		for (int i = 0; i < classifyList.size(); i++) {
			stringList.add(classifyList.get(i).getClassifyName());
		}
		return stringList;
	}
}
