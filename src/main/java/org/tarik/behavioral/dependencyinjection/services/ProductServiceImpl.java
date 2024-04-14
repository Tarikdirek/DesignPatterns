package org.tarik.behavioral.dependencyinjection.services;

import org.tarik.behavioral.dependencyinjection.repositories.ProductRepository;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add() {
        productRepository.add();
    }
}
