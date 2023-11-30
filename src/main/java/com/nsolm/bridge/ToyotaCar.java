package com.nsolm.bridge;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 10:13
 */
public class ToyotaCar extends Car {

    public ToyotaCar(Engine engine) {
        super(engine);
        this.brand = "toyota";
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("drive " + this.brand + " car...");
    }
}
