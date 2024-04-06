package org.tarik.creational.builder;

public class Main {
    public static void main(String[] args) {
        /*
        Product product = new Product();
        product.setName("Acer");
        product.setCategory("Electronic Devices");
        product.setColor("White");
        */

        Product product1 = new Product.Builder()
                .name("Asus")
                .category("Electronic Devices")
                .unitsInStock(10)
                .color("Blue")
                .unitPrice(100000)
                .build();
        System.out.println(product1.toString());
    }
}
