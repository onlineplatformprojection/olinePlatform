package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "remark")
public class Remark {
	@Id
	@Column(name = "r_id", nullable = false)
	private int remarkId;
	@Column(name = "remark_content", nullable = false)
	private String remarkContent;
	@Column(name = "a_id", nullable = false)
	private int articleId;
	@Column(name = "u_id", nullable = false)
	private long userId;
	@Column(name = "remarkDate", nullable = false)
	private Date pubDate;


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

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
}
