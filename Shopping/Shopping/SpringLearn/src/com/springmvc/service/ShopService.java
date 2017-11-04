package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.Product;
import com.springmvc.entity.ProductDetail;

public interface ShopService {

	List<Product> getAllProduct();

	ProductDetail getProductAndDetail(Integer id);

	void save(Product product, ProductDetail productDetail);

}
