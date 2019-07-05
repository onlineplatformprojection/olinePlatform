package com.example.demo2.dao;

import com.example.demo2.model.Video;

import java.util.ArrayList;
import java.util.List;

public class ChapterDao {

	private int chapterId;
	private String chapterName;
	private int courseId;
	//List<Video> videoList = new ArrayList<>();

	public ChapterDao(int chapterId, String chapterName, int courseId) {
		this.chapterId = chapterId;
		this.chapterName = chapterName;
		this.courseId = courseId;
		//this.videoList = videoList;
	}
}
