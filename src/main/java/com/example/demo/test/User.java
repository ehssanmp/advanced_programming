package com.example.demo.test;
import java.util.List;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;

  private String name;
  
  private String FamilyName;
  
  private String UserName;
  
  private String Password;
  
  private String NationalCode;
  
  private String PhoneNumber;
  
  private String Age;
  
  private String Sex;
  
  private String Nationality;
  
  private String LastDegreeState;
  
  @OneToMany
  private List<UserRoleRelation> userrelation;

  private String email;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFamilyName() {
	return FamilyName;
}

public void setFamilyName(String familyName) {
	FamilyName = familyName;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public String getNationalCode() {
	return NationalCode;
}

public void setNationalCode(String nationalCode) {
	NationalCode = nationalCode;
}

public String getPhoneNumber() {
	return PhoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}

public String getAge() {
	return Age;
}

public void setAge(String age) {
	Age = age;
}

public String getSex() {
	return Sex;
}

public void setSex(String sex) {
	Sex = sex;
}

public String getNationality() {
	return Nationality;
}

public void setNationality(String nationality) {
	Nationality = nationality;
}

public String getLastDegreeState() {
	return LastDegreeState;
}

public void setLastDegreeState(String lastDegreeState) {
	LastDegreeState = lastDegreeState;
}

public List<UserRoleRelation> getUserrelation() {
	return userrelation;
}

public void setUserrelation(List<UserRoleRelation> userrelation) {
	this.userrelation = userrelation;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

  

}
