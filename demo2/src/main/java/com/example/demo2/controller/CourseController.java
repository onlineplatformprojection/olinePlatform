package com.example.demo2.controller;

import com.example.demo2.model.Chapter;
import com.example.demo2.model.Course;
import com.example.demo2.model.Evaluate;
import com.example.demo2.service.ChapterService;
import com.example.demo2.service.CourseService;
import com.example.demo2.service.EvaluateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

	@Resource
	CourseService courseService;
	@Resource
	private ChapterService chapterService;
	@Resource
	private EvaluateService evaluateService;



	//首页课程
	@RequestMapping("/course_hpg")
	public List<Course> course_hpg(){
		return courseService.findAllCourse();
	}

	//具体的课程请求
	@RequestMapping("/course_target")
	public Map course_target(@RequestParam("courseId") int courseId){
		HashMap map = new HashMap();
		Course course = courseService.findCourseById(courseId);

		List<Chapter> chapterList = chapterService.findChapterByCourseId(courseId);
		List<Evaluate> evaluateList = evaluateService.listByCourseId(courseId);

		map.put("course",course);
		map.put("chapter",chapterList);
		map.put("evaluateList",evaluateList);
		return map;
	}

	//课程搜索
	@RequestMapping("/course_srh")
	public List<Course> course_srh(@RequestParam("courseName") String courseName){
		return courseService.findAllCourseLikeName(courseName);
	}

	//随机课程
	@RequestMapping("/course_good")
	public List<Course> course_good(){
		return courseService.findCourseRandom();
	}
}
