package com.ustglobal.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="order_info")
public class Order_Info {
     @Column
     @Id
	 private int order_id;
     @Column
	 private double total_price;
     @Column
	 private double total_with_gst;
     
   @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(name = "order_history",joinColumns = @JoinColumn(name="order_id"),
    		 inverseJoinColumns = @JoinColumn(name="id") )
     private List<Product_Info> product;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public double getTotal_with_gst() {
		return total_with_gst;
	}
	public void setTotal_with_gst(double total_with_gst) {
		this.total_with_gst = total_with_gst;
	}
	 
}
