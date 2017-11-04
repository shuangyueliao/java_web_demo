package com.springmvc.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.springmvc.dao.ProductDao;
import com.springmvc.entity.Product;
@Component
public class ProductDaoImpl implements ProductDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<Product> getAllProduct() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
	@Override
	public void save(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

}
