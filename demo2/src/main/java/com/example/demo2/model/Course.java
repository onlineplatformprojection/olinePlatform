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
	private int buyName;
	@Column(name = "c_price", nullable = false)
	private double price;
	@Column(name = "c_introduce", nullable = false)
	private String introdece;
	@Column(name = "c_img", nullable = false)
	private String img;

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

	public int getBuyName() {
		return buyName;
	}

	public void setBuyName(int buyName) {
		this.buyName = buyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIntrodece() {
		return introdece;
	}

	public void setIntrodece(String introdece) {
		this.introdece = introdece;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
