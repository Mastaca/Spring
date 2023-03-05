/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.domain.model;

public class ComparisonResult {

    private float ourPrice;
    private float theirPrice;

    public ComparisonResult(float ourPrice, float theirPrice) {
        this.ourPrice = ourPrice;
        this.theirPrice = theirPrice;
    }

    public float getOurPrice() {
        return ourPrice;
    }

    public float getTheirPrice() {
        return theirPrice;
    }
}
