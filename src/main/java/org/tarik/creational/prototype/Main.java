package org.tarik.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car(new Brand(1,"Dodge"),"Viper",2024,"Blue");
        Car car2 =  car.clone();

        System.out.println(car);
        System.out.println(car2);

        car2.getBrand().setName("McLauren");

        System.out.println(car.getBrand().getName());
        System.out.println(car2.getBrand().getName());;
    }
}
