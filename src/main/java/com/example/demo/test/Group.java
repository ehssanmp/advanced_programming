package com.example.demo.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany
	private List<Grader> graders ;
	
	@OneToMany
	private List<Attendant> attendants;
	
	@ManyToOne
	private WorkShop event;
	
	@OneToMany
	private List<GroupFormAswersheet> groupForm ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Grader> getGraders() {
		return graders;
	}

	public void setGraders(List<Grader> graders) {
		this.graders = graders;
	}

	public List<Attendant> getAttendants() {
		return attendants;
	}

	public void setAttendants(List<Attendant> attendants) {
		this.attendants = attendants;
	}

	public WorkShop getEvent() {
		return event;
	}

	public void setEvent(WorkShop event) {
		this.event = event;
	}

	public List<GroupFormAswersheet> getGroupForm() {
		return groupForm;
	}

	public void setGroupForm(List<GroupFormAswersheet> groupForm) {
		this.groupForm = groupForm;
	}
	
	
	
}
