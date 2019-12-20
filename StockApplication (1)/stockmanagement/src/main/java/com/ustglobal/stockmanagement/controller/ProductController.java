package com.ustglobal.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.Product_Info;
import com.ustglobal.stockmanagement.dto.Response;
import com.ustglobal.stockmanagement.service.ProductService;
@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class ProductController {
    @Autowired
	ProductService service;
    @PostMapping(path="/add",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
public Response addProduct(@RequestBody Product_Info product) {
	
	boolean products = service.addProduct(product);
	Response response = new Response();
	if(products) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("Data added to the DB");
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the DB");
	}
	return response;

}
@PutMapping(path="/modify")
public Response updateProduct(@RequestBody Product_Info product) {
	Response response = new Response();
	Product_Info productss = service.updateProduct(product);
	if(productss != null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("Data added to the DB");
		
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the DB");
	}
	return response;
}

@GetMapping(path="/getbyname/{name}")
public  Product_Info getbyname(@PathVariable("name") String name) {
	Response response = new Response();
	Product_Info info = service.getbbyname(name);
	if(info!=null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("Data added to the DB");
		
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the DB");
		
	}
	return info;
}
@GetMapping(path="/getbycategory/{category}")
public List<Product_Info> getbycategory(@PathVariable("category") String category) {
	Response response = new Response();
	List<Product_Info> info = service.getbycategory(category);
	
		if(info!=null) {
			response.setStatuscode(201);
			response.setMessage("Success");
			response.setDescription("Data added to the DB");
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not added to the DB");
			
		}
		return info;
}
@GetMapping(path="/getbycompany/{company}")
public List<Product_Info> getbycompany(@PathVariable("company") String company) {
	Response response = new Response();
	List<Product_Info> info = service.getbycompany(company);
	if(info!=null) {
		response.setStatuscode(201);
		response.setMessage("Success");
		response.setDescription("Data added to the DB");
		
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the DB");
		
	}
	return info;
}

}
