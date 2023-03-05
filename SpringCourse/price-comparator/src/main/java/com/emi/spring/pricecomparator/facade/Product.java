/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.facade;

public enum Product {
    LAPTOP,DESKTOP,PHONE;

    public static boolean contains(String productString) {
        for(Product product : Product.values()){
            if(product.name().equals(productString))
                return true;
        }
        return false;
    }
}
