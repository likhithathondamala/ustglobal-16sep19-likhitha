package com.ustglobal.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="person")
public class Person {
	@Id
	@Column
  private int pid;
	@Column
  private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn()
	private Voter_Card votercard;
	public Voter_Card getVotercard() {
		return votercard;
	}
	public void setVotercard(Voter_Card votercard) {
		this.votercard = votercard;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
