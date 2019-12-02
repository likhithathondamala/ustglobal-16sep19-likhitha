package com.ustglobal.productspringmvc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "retailer")
public class RetailerBean {

	@Id
	@Column
	@GeneratedValue
	private int retailerId;
	@Column
	private String retailerName;
	@Column
	private String retailerEmail;
	@Column
	private String retailerPassword;
	
	@OneToOne
	@JoinTable (name = "orderId")
	private RetailerBean reInfo;
}
