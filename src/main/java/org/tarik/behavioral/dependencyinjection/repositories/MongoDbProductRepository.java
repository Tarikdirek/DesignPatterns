package org.tarik.behavioral.dependencyinjection.repositories;

public class MongoDbProductRepository implements ProductRepository {
    @Override
    public void add() {
        System.out.println("Adding product to MongoDb");
    }
}
