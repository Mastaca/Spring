/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.domain.service;

import com.emi.spring.pricecomparator.domain.model.ComparisonResult;

public interface PriceComparatorService {
    ComparisonResult comparePriceFor(String product) throws NoRecordFoundException;
}
