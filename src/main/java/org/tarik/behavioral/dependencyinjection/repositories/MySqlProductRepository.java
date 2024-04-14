package org.tarik.behavioral.dependencyinjection.repositories;

public class MySqlProductRepository implements ProductRepository {
    @Override
    public void add() {
        System.out.println("Adding product to MySql");
    }
}
