package com.example.demo.test;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("AttendForm")
public class AttendForm extends Form{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany
	private List<AttendantFormAnswerSheet> attendFormAnswer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<AttendantFormAnswerSheet> getAttendFormAnswer() {
		return attendFormAnswer;
	}

	public void setAttendFormAnswer(List<AttendantFormAnswerSheet> attendFormAnswer) {
		this.attendFormAnswer = attendFormAnswer;
	}
	
	
}
