package com.ustglobal.jpawithhibernateapp1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentinfo")
public class StudentInfo {
	@Id
	@Column
  private int id;
	@Column
  private String name;
	@Column
  private String dept;
	@Column
  private int percentage;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
  
}
