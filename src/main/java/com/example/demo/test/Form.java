package com.example.demo.test;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="Form")
public class Form {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	
	@ManyToOne
	protected WorkShop event;
	
	
	protected List<String> questions ;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public WorkShop getEvent() {
		return event;
	}


	public void setEvent(WorkShop event) {
		this.event = event;
	}


	public List<String> getQuestions() {
		return questions;
	}


	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}


	
	
}
