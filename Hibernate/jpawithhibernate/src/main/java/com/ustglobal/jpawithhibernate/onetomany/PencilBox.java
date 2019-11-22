package com.ustglobal.jpawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.ToString.Exclude;


@Entity
@Table(name="pencilbox")
public class PencilBox {

	@Id
	@Column
	private int  bid;
	@Column
	private String bname;
	@Exclude
	@OneToMany(mappedBy = "pencilbox")
	private List<Pencil> pencil;
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
}
