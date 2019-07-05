package com.example.demo2.controller;

import com.example.demo2.model.Course;
import com.example.demo2.model.Purchase;
import com.example.demo2.service.CourseService;
import com.example.demo2.service.PurchaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PurchaseController {

	@Resource
	PurchaseService purchaseService;
	@Resource
	CourseService courseService;

	//购买课程
	@RequestMapping("/purchase")
	public Map purchase(@RequestParam("userId") int userId, @RequestParam("courseId") int courseId){
		HashMap map = new HashMap();
		Date date = new Date();
		Purchase purchase = new Purchase(userId, courseId, date);
		purchaseService.savePurchase(purchase);
		Course course = courseService.findCourseById(courseId);
		course.setBuyNum(course.getBuyNum()+1);
		courseService.updateCourseBuyNum(course);
		map.put("pur_true",1);
		return map;
	}

}
