package com.nsolm.bridge;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 10:18
 */
public class Client {
    public static void main(String[] args) {
        Car car = new ToyotaCar(new HybridEngine());
        Car car2 = new ToyotaCar(new FuelEngine());
        car.drive();
        car2.drive();
        System.out.println(car.getBrand());
        System.out.println(car2.getBrand());
    }
}
