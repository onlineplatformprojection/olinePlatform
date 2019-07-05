package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "remark")
public class Remark{
	@Id
	@Column(name = "R_id", nullable = false)
	private int remarkId;
	@Column(name = "Remark_content", nullable = false)
	private String remarkContent;
	@Column(name = "A_id", nullable = false)
	private int articleId;
	@Column(name = "U_id", nullable = false)
	private long userId;
	@Column(name = "Remark_Date", nullable = false)
	private Timestamp pubDate;

	public Remark(){}

	public int getRemarkId() {
		return remarkId;
	}

	public void setRemarkId(int remarkId) {
		this.remarkId = remarkId;
	}

	public String getRemarkContent() {
		return remarkContent;
	}

	public void setRemarkContent(String remarkContent) {
		this.remarkContent = remarkContent;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Timestamp getPubDate() {
		return pubDate;
	}

	public void setPubDate(Timestamp pubDate) {
		this.pubDate = pubDate;
	}
}
