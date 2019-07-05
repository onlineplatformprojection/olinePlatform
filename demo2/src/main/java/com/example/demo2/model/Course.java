package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "c_id", nullable = false)
	private int courseId;
	@Column(name = "c_name", nullable = false)
	private String courseName;
	@Column(name = "c_teacher", nullable = false)
	private String teacher;
	@Column(name = "c_buyNum", nullable = false)
	private int buyNum;
	@Column(name = "c_price", nullable = false)
	private double price;
	@Column(name = "c_introduce", nullable = false)
	private String introduce;
	@Column(name = "c_img", nullable = false)
	private String img;
	@Column(name = "a_classify")
	private String courseClassify;

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getCourseClassify() {
		return courseClassify;
	}

	public void setCourseClassify(String courseClassify) {
		this.courseClassify = courseClassify;
	}

	public Course(){}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(int buyName) {
		this.buyNum = buyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIntrodece() {
		return introduce;
	}

	public void setIntrodece(String introduce) {
		this.introduce = introduce;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
