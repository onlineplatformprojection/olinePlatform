//视频类

package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "video")
public class Video {
	@Id
	@Column(name = "v_id", nullable = false)
	private int videoId;
	@Column(name = "v_Name", nullable = false)
	private String videoName;
	@Column(name = "v_Addr", nullable = false)
	private String videoAddr;
	@Column(name = "chap_id", nullable = false)
	private int chapterId;

	public Video(){}

	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public int getChapter() {
		return chapterId;
	}
	public void setChapter(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getVideoAddr() {
		return videoAddr;
	}
	public void setVideoAddr(String videoAddr) {
		this.videoAddr = videoAddr;
	}
}
