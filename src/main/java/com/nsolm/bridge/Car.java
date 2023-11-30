package com.nsolm.bridge;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 10:09
 */
public abstract class Car {

    protected Engine engine;

    protected String brand;

    public Car(Engine engine){
        this.engine = engine;
    }

    public abstract void drive();

    public String getBrand(){
        return this.brand;
    }
}
