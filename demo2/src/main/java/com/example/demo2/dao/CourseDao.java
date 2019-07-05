package com.example.demo2.dao;

import com.example.demo2.model.Chapter;

import java.util.ArrayList;
import java.util.List;

public class CourseDao {

	private int courseId;
	private String courseName;
	private String teacher;
	private int buyName;
	private double price;
	private String introduce;
	private String img;
	Chapter chapter;

	public CourseDao(int courseId, String courseName, String teacher, int buyName, double price, String introduce, String img, Chapter chapter) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.teacher = teacher;
		this.buyName = buyName;
		this.price = price;
		this.introduce = introduce;
		this.img = img;
		this.chapter = chapter;
	}
}
