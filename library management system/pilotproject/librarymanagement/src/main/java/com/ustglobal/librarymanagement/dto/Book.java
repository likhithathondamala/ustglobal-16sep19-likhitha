package com.ustglobal.librarymanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue
	@Column
private int bid;
	@Column
	@NotBlank
private String bname;
	@Column
	@NotBlank
private String author;
	@Column
	@NotBlank
	private String publisher;
	@Column
	@Past
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date yearofpublication;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public Date getYearofpublication() {
	return yearofpublication;
}
public void setYearofpublication(Date yearofpublication) {
	this.yearofpublication = yearofpublication;
}



}
