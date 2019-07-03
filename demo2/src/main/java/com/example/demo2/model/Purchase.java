//购买的课程

package com.example.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "purchase")
public class Purchase {

	@Id
	@Column(name = "p_id", nullable = false)
	private int purchaseId;
	@Column(name = "u_id", nullable = false)
	private long userId;
	@Column(name = "c_id", nullable = false)
	private int courseId;
	@Column(name = "buyDate", nullable = false)
	private Date pubDate;

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
}
