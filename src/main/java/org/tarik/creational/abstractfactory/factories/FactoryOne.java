package org.tarik.creational.abstractfactory.factories;

import org.tarik.creational.abstractfactory.caching.CachingBase;
import org.tarik.creational.abstractfactory.caching.RedisCaching;
import org.tarik.creational.abstractfactory.logging.DatabaseLogger;
import org.tarik.creational.abstractfactory.logging.LoggerBase;

public class FactoryOne extends CrossCuttingConcernFactory {
    @Override
    public CachingBase getCaching() {
        return new RedisCaching();
    }

    @Override
    public LoggerBase getLogger() {
        return new DatabaseLogger();
    }
}
