/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.facade;

public interface PriceUpdateFacade {

    void updatePriceForProduct(String productName,float newPrice);

}
