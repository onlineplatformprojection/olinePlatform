package com.example.demo2.controller;

import com.example.demo2.dao.ChapterDao;
import com.example.demo2.model.Chapter;
import com.example.demo2.model.Course;
import com.example.demo2.model.Evaluate;
import com.example.demo2.model.Purchase;
import com.example.demo2.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

	@Resource
	private CourseService courseService;
	@Resource
	private ChapterService chapterService;
	@Resource
	private EvaluateService evaluateService;
	@Resource
	private PurchaseService purchaseService;
	@Resource
	private VideoService videoService;


	//首页课程
	@RequestMapping("/course_hpg")
	public List<Course> course_hpg(){
		return courseService.findAllCourse();
	}

	//具体的课程请求
	@RequestMapping("/course_target_detail")
	public Map course_target_detail(@RequestParam("courseId") int courseId){
		HashMap map = new HashMap();
		Course course = courseService.findCourseById(courseId);

		List<Chapter> chapterList = chapterService.findChapterByCourseId(courseId);
		List<Evaluate> evaluateList = evaluateService.listByCourseId(courseId);

		List<ChapterDao> chapterDaoList = new ArrayList<>();

		for (int i = 0; i < chapterList.size(); i++) {
			ChapterDao chapterDao = new ChapterDao(chapterList.get(i));
			chapterDao.setVideoList(videoService.findAllVideoByChapterId(chapterList.get(i).getChaperId()));
			chapterDaoList.add(chapterDao);
		}

		map.put("course",course);
		map.put("chapter",chapterDaoList);
		map.put("evaluateList",evaluateList);
		return map;
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

	//课程分类搜搜
	@RequestMapping("/course_cls")
	public List<Course> course_cls(@RequestParam("clsName") String clsName){
		return courseService.findCourseByClassifyName(clsName);
	}

	//搜索我的课程
	@RequestMapping("/course_get")
	public List<Course> course_get(@RequestParam("userId") long userId){
		List<Course> courseList = new ArrayList<>();
		List<Purchase> purchaseList = purchaseService.listByUserId(userId);
		for (int i = 0; i < purchaseList.size(); i++) {
			courseList.add(courseService.findCourseById(purchaseList.get(i).getCourseId()));
		}
		return courseList;
	}

}
