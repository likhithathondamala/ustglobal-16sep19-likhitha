package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Product_Info;

public interface ProductService {
	 public boolean addProduct(Product_Info product);
	  public Product_Info updateProduct(Product_Info product);
	  public  Product_Info getbbyname(String name);
	  public  List<Product_Info> getbycategory(String category);
	  public  List<Product_Info> getbycompany(String company);
}
