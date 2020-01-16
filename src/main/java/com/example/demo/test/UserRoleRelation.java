package com.example.demo.test;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class UserRoleRelation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iD;
	
	@DateTimeFormat
	private Date Start;
	
	@DateTimeFormat
	private Date End;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private WorkShopRole workShopRole;
	
	private boolean Active;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public Date getStart() {
		return Start;
	}

	public void setStart(Date start) {
		Start = start;
	}

	public Date getEnd() {
		return End;
	}

	public void setEnd(Date end) {
		End = end;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public WorkShopRole getWorkShopRole() {
		return workShopRole;
	}

	public void setWorkShopRole(WorkShopRole workShopRole) {
		this.workShopRole = workShopRole;
	}

	public boolean isActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}

		
	
}
