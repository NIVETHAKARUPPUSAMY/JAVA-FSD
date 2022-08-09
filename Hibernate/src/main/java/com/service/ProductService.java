package com.service;

import com.bean.Product;
import com.dao.ProductDao;
public class ProductService {
	ProductDao pd = new ProductDao();
	public String storeProduct(Product prdt) {
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