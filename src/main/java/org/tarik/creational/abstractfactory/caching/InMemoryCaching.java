package org.tarik.creational.abstractfactory.caching;

public class InMemoryCaching implements CachingBase {
    @Override
    public void cache(String value) {
        System.out.println("Cached in memory: " + value);
    }
}
