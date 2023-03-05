/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.domain.service;

import com.emi.spring.pricecomparator.domain.HibernateUtil;
import com.emi.spring.pricecomparator.domain.dao.ProductDAO;
import com.emi.spring.pricecomparator.domain.dao.ProductDAOImpl;
import com.emi.spring.pricecomparator.domain.entity.ProductEntity;
import com.emi.spring.pricecomparator.facade.Product;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void updatePriceForProduct(String productName, float newPrice) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        Transaction tx = session.beginTransaction();
        try {
            ProductEntity productEntity = productDAO.getProductByName(productName);
            productEntity.setPrice(newPrice);
            productDAO.updateProduct(productEntity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException();
        } finally {
            try {
                session.close();
            } catch (SessionException e) {

            }
        }
    }

    public List<Product> findNonExistingProducts() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            List<ProductEntity> listProducts = productDAO.findAllProducts();
            List<String> productNames = new ArrayList<String>();
            for (ProductEntity p : listProducts) {
                productNames.add(p.getProductName());
            }
            Product[] products = Product.values();
            List<Product> nonExistingproducts = new ArrayList<Product>();
            for (Product product : products) {
                if (!productNames.contains(product.name())) {
                    nonExistingproducts.add(product);
                }
            }
            return nonExistingproducts;
        } finally {
            session.close();
        }
    }

    public void createProduct(Long id, String productName, float newPrice) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            ProductEntity productEntity = new ProductEntity(id, productName, newPrice);
            productDAO.saveProduct(productEntity);
            tx.commit();
        } finally {
            try {
                session.close();
            } catch (SessionException e) {

            }
        }
    }

    public List<ProductEntity> findAllProducts() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            List<ProductEntity> allProductsList= productDAO.findAllProducts();
            return allProductsList;
        } finally {
            try {
                session.close();
            } catch (SessionException e) {
            }
        }
    }
}
