package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.Product;

public interface ProductDao {

	
	List<Product> getAllProduct();

	void save(Product product);

	

}
