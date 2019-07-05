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
	@Column(name = "buy_date", nullable = false)
	private Date purDate;

	public Purchase(){}

	public Purchase(int userId, int courseId, Date purDate) {
		this.userId = userId;
		this.courseId = courseId;
		this.purDate = purDate;
	}

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
		return purDate;
	}

	public void setPubDate(Date purDate) {
		this.purDate = purDate;
	}
}
