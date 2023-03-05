/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.facade;

import com.emi.spring.pricecomparator.domain.service.ProductService;

public class PriceUpdateFacadeImpl implements PriceUpdateFacade {

    private ProductService productService;

    public PriceUpdateFacadeImpl(ProductService productService) {
        this.productService = productService;
    }

    public void updatePriceForProduct(String productName, float newPrice) {
        productService.updatePriceForProduct(productName,newPrice);
    }
}
