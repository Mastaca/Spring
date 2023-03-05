/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2020 THALES ALENIA SPACE FRANCE. All rights reserved
 * -------------------------------------------------------------------------
 */
package com.emi.spring.pricecomparator;

import com.emi.spring.pricecomparator.domain.dao.ProductDAO;
import com.emi.spring.pricecomparator.domain.dao.ProductDAOImpl;
import com.emi.spring.pricecomparator.domain.service.PriceComparatorService;
import com.emi.spring.pricecomparator.domain.service.PriceComparatorServiceImpl;
import com.emi.spring.pricecomparator.domain.service.ProductService;
import com.emi.spring.pricecomparator.domain.service.ProductServiceImpl;
import com.emi.spring.pricecomparator.external.ExternalService;
import com.emi.spring.pricecomparator.external.ExternalServiceImpl;
import com.emi.spring.pricecomparator.facade.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ProductDAO productDAO = new ProductDAOImpl();
//        ExternalService externalService = new ExternalServiceImpl();
//        PriceComparatorService priceComparatorService = new PriceComparatorServiceImpl(productDAO, externalService);
//        PriceCompareFacade priceCompareFacade = new PriceCompareFacadeImpl(priceComparatorService);
//
//        ProductService productService = new ProductServiceImpl(productDAO);
//        PriceUpdateFacade priceUpdateFacade = new PriceUpdateFacadeImpl(productService);
//        Application application = new Application(priceCompareFacade, priceUpdateFacade);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Application application = applicationContext.getBean(Application.class);
        Application application2 = applicationContext.getBean(Application.class);

        application.run();

    }

}
