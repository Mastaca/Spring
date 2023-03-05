package com.emi.spring.pricecomparator.facade;

import com.emi.spring.pricecomparator.domain.entity.ProductEntity;
import com.emi.spring.pricecomparator.domain.service.ProductService;

import java.util.List;

public class ProductCreateFacadeImpl implements ProductCreateFacade{

    private ProductService productService;

    public ProductCreateFacadeImpl(ProductService productService) {
        this.productService = productService;
    }

    public void createProduct(Long id, String productName, float newPrice) {
        productService.createProduct(id, productName, newPrice);
    }

    public List<ProductEntity> findAllProducts() {
        return productService.findAllProducts();
    }
}
