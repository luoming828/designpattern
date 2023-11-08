package com.nsolm.abstractfactory;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:08
 */
public class Client {
    public static void main(String[] args) {
        FoodAbstractFactory naixue = FoodAbstractFactory.createFactory("naixue");
        naixue.creatCream().createCream();
        naixue.createCola().createCola();

    }
}
