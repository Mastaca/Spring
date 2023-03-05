/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.facade;

import com.emi.spring.pricecomparator.domain.model.ComparisonResult;
import com.emi.spring.pricecomparator.domain.service.NoRecordFoundException;
import com.emi.spring.pricecomparator.domain.service.PriceComparatorService;
import com.emi.spring.pricecomparator.domain.service.PriceComparatorServiceImpl;

public class PriceCompareFacadeImpl implements PriceCompareFacade {

    private PriceComparatorService priceComparatorService;

    public PriceCompareFacadeImpl(PriceComparatorService priceComparatorService) {
        this.priceComparatorService = priceComparatorService;
    }

    public ComparisonResult comparePrice(String productName) throws NoRecordFoundException {
        ComparisonResult result = priceComparatorService.comparePriceFor(productName);
        return result;
    }

}
