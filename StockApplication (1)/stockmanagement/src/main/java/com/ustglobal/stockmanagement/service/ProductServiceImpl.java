package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductDAO;
import com.ustglobal.stockmanagement.dto.Product_Info;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
	ProductDAO dao;
	@Override
	public boolean addProduct(Product_Info product) {
		
		return dao.addProduct(product);
	}

	@Override
	public Product_Info updateProduct(Product_Info product) {
		
		return dao.updateProduct(product);
	}

	@Override
	public  Product_Info getbbyname(String name) {
		
		return dao.getbbyname(name);
	}

	@Override
	public List<Product_Info> getbycategory(String category) {
		
		return dao.getbycategory(category);
	}

	@Override
	public  List<Product_Info> getbycompany(String company) {
		
		return dao.getbycompany(company);
	}

	

	
}
