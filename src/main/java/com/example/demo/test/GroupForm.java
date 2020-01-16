package com.example.demo.test;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("GroupForm")
public class GroupForm extends Form{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany
	private List<GroupFormAswersheet> groupformanswersheet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<GroupFormAswersheet> getGroupformanswersheet() {
		return groupformanswersheet;
	}

	public void setGroupformanswersheet(List<GroupFormAswersheet> groupformanswersheet) {
		this.groupformanswersheet = groupformanswersheet;
	}
	

}
