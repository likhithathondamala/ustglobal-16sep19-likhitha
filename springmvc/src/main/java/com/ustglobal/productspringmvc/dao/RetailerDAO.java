package com.ustglobal.productspringmvc.dao;

import com.ustglobal.productspringmvc.dto.ProductBean;
import com.ustglobal.productspringmvc.dto.RetailerBean;

public interface RetailerDAO {

	public RetailerBean login(int id, String password);
	public int register(RetailerBean bean);
	public ProductBean searchProduct(int id);
	public boolean changePassword(int id, String password);

}
