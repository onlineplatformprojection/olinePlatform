package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "chapter")
public class Chapter {
	@Id
	@Column(name = "chap_id", nullable = false)
	private int chapterId;
	@Column(name = "chap_name", nullable = false)
	private String chapterName;
	@Column(name = "c_id", nullable = false)
	private int courseId;

	public Chapter(){}

	public int getChaperId() {
		return chapterId;
	}

	public void setChaperId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getChaperName() {
		return chapterName;
	}

	public void setChaperName(String chapterName) {
		this.chapterName = chapterName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
}
