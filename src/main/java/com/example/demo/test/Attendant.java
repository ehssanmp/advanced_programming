package com.example.demo.test;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Attendant")
public class Attendant extends WorkShopRole  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iD;
	
	private boolean IsPassed;
	
	private float Score;
	
	private int Absences;

	@ManyToOne
	private Group groups;
	
	@OneToMany
	private List<AttendantFormAnswerSheet> attendForm;

	
	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public boolean isIsPassed() {
		return IsPassed;
	}

	public void setIsPassed(boolean isPassed) {
		IsPassed = isPassed;
	}

	public float getScore() {
		return Score;
	}

	public void setScore(float score) {
		Score = score;
	}

	public int getAbsences() {
		return Absences;
	}

	public void setAbsences(int absences) {
		Absences = absences;
	}

	public Group getGroups() {
		return groups;
	}

	public void setGroups(Group groups) {
		this.groups = groups;
	}

	public List<AttendantFormAnswerSheet> getAttendForm() {
		return attendForm;
	}

	public void setAttendForm(List<AttendantFormAnswerSheet> attendForm) {
		this.attendForm = attendForm;
	}
	
	
	
	
}
