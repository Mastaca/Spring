package com.emi.spring.pricecomparator.facade;

import com.emi.spring.pricecomparator.domain.entity.ProductEntity;

import java.util.List;

public interface ProductCreateFacade {

    void createProduct(Long id, String productName, float newPrice);
    public List<ProductEntity> findAllProducts();

}
