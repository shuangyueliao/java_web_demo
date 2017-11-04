package com.springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.ProductDao;
import com.springmvc.dao.ProductDetailDao;
import com.springmvc.entity.Product;
import com.springmvc.entity.ProductDetail;
import com.springmvc.service.ShopService;
@Component
@Transactional
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ProductDao productDao;
	@Autowired
	private ProductDetailDao productDetailDao;
	@Override
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}

	@Override
	public ProductDetail getProductAndDetail(Integer id) {
		return productDetailDao.getProductAndDetail(id);
	}

	@Override
	public void save(Product product, ProductDetail productDetail) {
		productDao.save(product);
		productDetailDao.save(productDetail);
	}

}
