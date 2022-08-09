package com.service;

import javax.servlet.annotation.WebServlet;

import com.bean.product;
import com.dao.ProductDao;
public class ProductService {
	ProductDao pd = new ProductDao();
	public String storeProduct(product prdt) {
		/*if(prdt.ge()<100) {
			return "Product price must be > 100";
		}else */
		 if(pd.storeProduct(prdt)>0) {
			return "Product stored successfully";
		}else {
			return "Product didn't store id must be unique";
		}
	}
	
	
}