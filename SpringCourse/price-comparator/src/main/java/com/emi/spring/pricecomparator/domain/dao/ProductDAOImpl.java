/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.domain.dao;

import com.emi.spring.pricecomparator.domain.HibernateUtil;
import com.emi.spring.pricecomparator.domain.entity.ProductEntity;
import com.emi.spring.pricecomparator.facade.Product;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    public ProductEntity getProductByName(String name) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("Select p FROM ProductEntity p where p.productName = :productName");
        query.setParameter("productName",name);
        ProductEntity persistentProductEntity = (ProductEntity) query.uniqueResult();
        return persistentProductEntity;
    }

    public void updateProduct(ProductEntity productEntity) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.saveOrUpdate(productEntity);
    }

    public List<ProductEntity> findAllProducts() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("Select p FROM ProductEntity p");
        List<ProductEntity> listProducts = (List<ProductEntity>) query.list();
        return listProducts;
    }

    public void saveProduct(ProductEntity productEntity) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.save(productEntity);
    }

}
