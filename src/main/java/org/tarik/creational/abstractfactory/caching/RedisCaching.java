package org.tarik.creational.abstractfactory.caching;

public class RedisCaching implements CachingBase {
    @Override
    public void cache(String value) {
        System.out.println("Cached in redis: " + value);
    }
}
