package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "article")
public class Article {
	@Id
	@Column(name = "a_id", nullable = false)
	private int articleId;
	@Column(name = "a_title", nullable = false)
	private String articleTitle;
	@Column(name = "a_content", nullable = false)
	private String articleContent;
	@Column(name = "u_id", nullable = false)
	private long userId;
	@Column(name = "a_publishDate", nullable = false)
	private Date pubDate;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
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
