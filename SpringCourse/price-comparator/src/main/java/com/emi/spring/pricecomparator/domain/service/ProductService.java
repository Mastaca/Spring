/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.domain.service;

import com.emi.spring.pricecomparator.domain.entity.ProductEntity;
import com.emi.spring.pricecomparator.facade.Product;

import java.util.List;

public interface ProductService {

    void updatePriceForProduct (String productName, float newPrice);
    List<Product> findNonExistingProducts();
    void createProduct (Long id, String productName, float newPrice);

    List<ProductEntity> findAllProducts();
}
