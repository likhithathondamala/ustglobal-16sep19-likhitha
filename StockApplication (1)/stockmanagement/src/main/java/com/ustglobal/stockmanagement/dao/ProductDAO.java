package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Product_Info;

public interface ProductDAO {
  public boolean addProduct(Product_Info product);
  public Product_Info updateProduct(Product_Info product);
  public  Product_Info getbbyname(String name);
  public  List<Product_Info> getbycategory(String category);
  public List<Product_Info> getbycompany(String company);
  
}
