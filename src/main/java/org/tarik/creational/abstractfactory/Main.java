package org.tarik.creational.abstractfactory;

import org.tarik.creational.abstractfactory.factories.FactoryOne;
import org.tarik.creational.abstractfactory.factories.FactoryTwo;
import org.tarik.creational.abstractfactory.services.CustomerService;
import org.tarik.creational.abstractfactory.services.CustomerServiceImpl;
import org.tarik.creational.abstractfactory.services.ProductService;
import org.tarik.creational.abstractfactory.services.ProductServiceImpl;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new FactoryOne());
        productService.add();

        CustomerService customerService = new CustomerServiceImpl(new FactoryTwo());
        customerService.add();
    }
}
