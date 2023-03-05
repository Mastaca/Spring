/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator.facade;

public enum UserActionOptions {

    COMPARE(1,"Compare a product"),
    UPDATE(2,"Update a product"),
    CREATE(3,"Create a new product"),
    SHOWALL(4,"Show all products");

    private int nr;
    private String text;

    UserActionOptions(int nr, String text) {
        this.nr = nr;
        this.text = text;
    }

    public int getNr() {
        return nr;
    }

    public String getText() {
        return text;
    }

    public static UserActionOptions getEnumFromNr(int actionNr) {
        for(UserActionOptions userActionOption : UserActionOptions.values()) {
            if(userActionOption.getNr() == actionNr)
                return userActionOption;
        }
        return null;
    }
}
