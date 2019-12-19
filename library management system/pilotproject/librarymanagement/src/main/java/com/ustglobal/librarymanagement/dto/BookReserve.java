package com.ustglobal.librarymanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="bookreserve")
public class BookReserve {
    @Id
    @GeneratedValue
	@Column
	private int registrationId;
    @NotNull
	@Column
	private int bid;
    @NotNull
	@Column
	private int id;
    @Past
   
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
}
