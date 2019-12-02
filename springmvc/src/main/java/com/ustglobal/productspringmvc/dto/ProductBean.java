package com.ustglobal.productspringmvc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "product")
public class ProductBean {

	@Id
	@Column
	private int orderId;
	@Column
	private String productName;
	@Column
	private int pricePerUnit;
	@Column
	private int productQuantity;
	@Column
	private int amountPayable;

}
