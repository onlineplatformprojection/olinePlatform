package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classify")
public class Classify {
	@Id
	@Column(name = "cls_id")
	private int classifyId;
	@Column(name = "cls_name")
	private String classifyName;

	public Classify(){}

	public Classify(String classifyName) {
		this.classifyName = classifyName;
	}

	public int getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(int classifyId) {
		this.classifyId = classifyId;
	}

	public String getClassifyName() {
		return classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
}
