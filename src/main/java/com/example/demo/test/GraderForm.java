package com.example.demo.test;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("GraderForm")
public class GraderForm extends Form{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany
	private List<GraderFormAnswerSheet> graderFormAns;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<GraderFormAnswerSheet> getGraderFormAns() {
		return graderFormAns;
	}

	public void setGraderFormAns(List<GraderFormAnswerSheet> graderFormAns) {
		this.graderFormAns = graderFormAns;
	}
	
	
}
