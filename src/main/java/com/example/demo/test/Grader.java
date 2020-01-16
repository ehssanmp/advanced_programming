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
@DiscriminatorValue("Grader")
public class Grader extends WorkShopRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Group group;
	
	@OneToMany
	private List<AttendantFormAnswerSheet> attendentsForm;
	
	@OneToMany
	private List<GraderFormAnswerSheet> graderFormAns;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public List<AttendantFormAnswerSheet> getAttendentsForm() {
		return attendentsForm;
	}

	public void setAttendentsForm(List<AttendantFormAnswerSheet> attendentsForm) {
		this.attendentsForm = attendentsForm;
	}

	public List<GraderFormAnswerSheet> getGraderFormAns() {
		return graderFormAns;
	}

	public void setGraderFormAns(List<GraderFormAnswerSheet> graderFormAns) {
		this.graderFormAns = graderFormAns;
	}

	
	
	

	
	
	
}
