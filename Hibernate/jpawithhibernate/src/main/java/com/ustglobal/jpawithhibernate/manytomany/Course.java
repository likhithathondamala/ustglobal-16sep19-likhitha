package com.ustglobal.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.ToString.Exclude;

@Entity
@Table(name="course")
public class Course {
	@Column
	@Id
	private int cid;
	@Column
	private String cname;
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL ,mappedBy = "course")

	private List<Student> student;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	

	

}
