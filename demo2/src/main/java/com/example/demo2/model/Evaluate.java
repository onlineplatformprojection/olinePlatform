package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "evaluate")
public class Evaluate {
	@Id
	@Column(name = "e_id", nullable = false)
	private int evaId;
	@Column(name = "e_content", nullable = false)
	private String evaContent;
	@Column(name = "c_id", nullable = false)
	private int courseId;
	@Column(name = "u_id", nullable = false)
	private long userId;
	@Column(name = "evaluate_date", nullable = false)
	private Date pubDate;

	public Evaluate(){}

	public int getEvaId() {
		return evaId;
	}

	public void setEvaId(int evaId) {
		this.evaId = evaId;
	}

	public String getEvaContent() {
		return evaContent;
	}

	public void setEvaContent(String evaContent) {
		this.evaContent = evaContent;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
}
