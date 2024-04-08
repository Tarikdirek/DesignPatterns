package org.tarik.creational.abstractfactory.factories;

import org.tarik.creational.abstractfactory.caching.CachingBase;
import org.tarik.creational.abstractfactory.caching.InMemoryCaching;
import org.tarik.creational.abstractfactory.logging.FileLogger;
import org.tarik.creational.abstractfactory.logging.LoggerBase;

public class FactoryTwo extends CrossCuttingConcernFactory {
    @Override
    public CachingBase getCaching() {
        return new InMemoryCaching();
    }

    @Override
    public LoggerBase getLogger() {
        return new FileLogger();
    }
}
