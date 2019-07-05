package com.example.demo2.dao;

import com.example.demo2.model.Video;

import java.util.ArrayList;
import java.util.List;

public class ChapterDao {

	private int chaperId;
	private String chaperName;
	private int courseId;
	//List<Video> videoList = new ArrayList<>();

	public ChapterDao(int chaperId, String chaperName, int courseId) {
		this.chaperId = chaperId;
		this.chaperName = chaperName;
		this.courseId = courseId;
		//this.videoList = videoList;
	}
}
