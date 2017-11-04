package com.springmvc.dao;

import com.springmvc.entity.ProductDetail;

public interface ProductDetailDao {

	ProductDetail getProductAndDetail(Integer id);

	void save(ProductDetail productDetail);

	
	

	

}
