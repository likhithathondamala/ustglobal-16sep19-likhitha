package com.ustglobal.librarymanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@Column
private int aid;
	@Column
private String password;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
