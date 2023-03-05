/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.facade;

import com.emi.spring.pricecomparator.domain.model.ComparisonResult;
import com.emi.spring.pricecomparator.domain.service.NoRecordFoundException;

public interface PriceCompareFacade {
    ComparisonResult comparePrice(String productName) throws NoRecordFoundException;
}
