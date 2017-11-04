package com.springmvc.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.springmvc.dao.ProductDetailDao;
import com.springmvc.entity.ProductDetail;
@Component
public class ProductDetailDaoImpl implements ProductDetailDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public ProductDetail getProductAndDetail(Integer id) {
		Query query=sessionFactory.getCurrentSession().createQuery("from ProductDetail where product.id=?");
		query.setParameter(0,id);
		return (ProductDetail) query.list().get(0);
	}
	@Override
	public void save(ProductDetail productDetail) {
		sessionFactory.getCurrentSession().save(productDetail);
	}

}
