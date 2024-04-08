package org.tarik.creational.abstractfactory.services;

import org.tarik.creational.abstractfactory.caching.CachingBase;
import org.tarik.creational.abstractfactory.factories.CrossCuttingConcernFactory;
import org.tarik.creational.abstractfactory.logging.LoggerBase;

public class ProductServiceImpl implements ProductService {

    private final CachingBase cachingBase;
    private final LoggerBase loggerBase;

    public ProductServiceImpl(CrossCuttingConcernFactory factory) {
        this.cachingBase = factory.getCaching();
        this.loggerBase = factory.getLogger();
    }

    @Override
    public void add() {
        cachingBase.cache("Product added");
        loggerBase.log("Product added");
    }
}
