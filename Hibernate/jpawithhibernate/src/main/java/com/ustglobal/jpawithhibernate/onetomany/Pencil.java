package com.ustglobal.jpawithhibernate.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pencil")
public class Pencil {
	@Id
	@Column
	private int id;
	@Column
	private String color;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid",nullable = false)
	private PencilBox pencilbox;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public PencilBox getPencilbox() {
		return pencilbox;
	}
	public void setPencilbox(PencilBox pencilbox) {
		this.pencilbox = pencilbox;
	}

	
}
