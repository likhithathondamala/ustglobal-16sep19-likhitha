package com.ustglobal.productspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.productspringmvc.dao.RetailerDAO;
import com.ustglobal.productspringmvc.dto.ProductBean;
import com.ustglobal.productspringmvc.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{

	@Autowired
	private RetailerDAO dao;

	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		return dao.register(bean);
	}


	@Override 
	public ProductBean searchProduct(int id) { 
		return dao.searchProduct(id); 
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

}
