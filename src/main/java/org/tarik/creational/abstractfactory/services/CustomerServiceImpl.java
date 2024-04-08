package org.tarik.creational.abstractfactory.services;

import org.tarik.creational.abstractfactory.caching.CachingBase;
import org.tarik.creational.abstractfactory.factories.CrossCuttingConcernFactory;
import org.tarik.creational.abstractfactory.logging.LoggerBase;

public class CustomerServiceImpl implements CustomerService {

    private final CachingBase cachingBase;
    private final LoggerBase loggerBase;
    public CustomerServiceImpl(CrossCuttingConcernFactory factory) {
        this.cachingBase = factory.getCaching();
        this.loggerBase = factory.getLogger();
    }
    @Override
    public void add() {
        loggerBase.log("Customer added");
        cachingBase.cache("Customer added");
    }
}
