package org.tarik.behavioral.dependencyinjection;

import org.tarik.behavioral.dependencyinjection.repositories.MySqlProductRepository;
import org.tarik.behavioral.dependencyinjection.services.ProductService;
import org.tarik.behavioral.dependencyinjection.services.ProductServiceImpl;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new MySqlProductRepository());
        productService.add();
    }
}
