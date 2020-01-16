package com.example.demo.test;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Supervisor")
public class Supervisor extends WorkShopRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany
	private List<GraderFormAnswerSheet> graderForm;
	
	@OneToOne
	private WorkShop Event;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<GraderFormAnswerSheet> getGraderForm() {
		return graderForm;
	}

	public void setGraderForm(List<GraderFormAnswerSheet> graderForm) {
		this.graderForm = graderForm;
	}

	public WorkShop getEvent() {
		return Event;
	}

	public void setEvent(WorkShop event) {
		Event = event;
	}

	
	
}
