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
	private int chaperId;
	@Column(name = "chap_name", nullable = false)
	private String chaperName;
	@Column(name = "c_id", nullable = false)
	private int courseId;

	public Chapter(){}

	public int getChaperId() {
		return chaperId;
	}

	public void setChaperId(int chaperId) {
		this.chaperId = chaperId;
	}

	public String getChaperName() {
		return chaperName;
	}

	public void setChaperName(String chaperName) {
		this.chaperName = chaperName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
}
