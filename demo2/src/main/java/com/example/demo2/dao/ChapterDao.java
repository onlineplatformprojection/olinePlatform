package com.example.demo2.dao;

import com.example.demo2.model.Chapter;
import com.example.demo2.model.Video;

import java.util.List;
import java.util.Map;

public class ChapterDao {

	private int chapterId;
	private String chapterName;
	private int courseId;
	private List<Video> videoList;

	public ChapterDao(Chapter chapter) {
		this.chapterId = chapter.getChaperId();
		this.chapterName = chapter.getChaperName();
		this.courseId = chapter.getCourseId();
		//this.videoList = videoList;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public List getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> mapVideo) {
		this.videoList = mapVideo;
	}
}
