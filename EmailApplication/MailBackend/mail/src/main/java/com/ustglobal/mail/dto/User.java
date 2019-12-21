package com.ustglobal.mail.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="user_info")
public class User {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String user_name;
	@Column(unique = true , nullable = false)
	private String email;
	@Column
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToMany(mappedBy = "user")
	public List<Mail> mail;
	public List<Mail> getMail() {
		return mail;
	}
	public void setMail(List<Mail> mail) {
		this.mail = mail;
	}
	
	
	
}
