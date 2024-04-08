package org.tarik.creational.abstractfactory.factories;

import org.tarik.creational.abstractfactory.caching.CachingBase;
import org.tarik.creational.abstractfactory.logging.LoggerBase;

public abstract class CrossCuttingConcernFactory {

    public abstract CachingBase getCaching();
    public abstract LoggerBase getLogger();
}
