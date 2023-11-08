package com.nsolm.abstractfactory.naixue;

import com.nsolm.abstractfactory.Cola;
import com.nsolm.abstractfactory.Cream;
import com.nsolm.abstractfactory.FoodAbstractFactory;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:03
 */
public class NaixueFoodFactory implements FoodAbstractFactory {
    @Override
    public Cola createCola() {
        return new NaixueCola();
    }

    @Override
    public Cream creatCream() {
        return new NaixueCream();
    }
}
