package com.example.demo.test;

import java.util.List;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.tomcat.jni.Time;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class WorkShop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String Name;
	
	@DateTimeFormat
	private Date Start;
	
	@DateTimeFormat
	private Date End;
	
	@DateTimeFormat
	private Time StartTime;
	
	@DateTimeFormat
	private Time EndTime;
	
	private String Days;
	
	private String Adress;
	
	@OneToMany
	private List<Form> forms;
	
	@OneToMany
	private List<Group> groups ;
	
	@OneToOne
	private Supervisor superVisor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public Time getStartTime() {
		return StartTime;
	}

	public void setStartTime(Time startTime) {
		StartTime = startTime;
	}

	public Time getEndTime() {
		return EndTime;
	}

	public void setEndTime(Time endTime) {
		EndTime = endTime;
	}

	public String getDays() {
		return Days;
	}

	public void setDays(String days) {
		Days = days;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public List<Form> getForms() {
		return forms;
	}

	public void setForms(List<Form> forms) {
		this.forms = forms;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public Supervisor getSuperVisor() {
		return superVisor;
	}

	public void setSuperVisor(Supervisor superVisor) {
		this.superVisor = superVisor;
	}
	
	
	
	
	
}
