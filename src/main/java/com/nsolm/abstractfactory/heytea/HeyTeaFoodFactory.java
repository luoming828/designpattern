package com.nsolm.abstractfactory.heytea;

import com.nsolm.abstractfactory.Cola;
import com.nsolm.abstractfactory.Cream;
import com.nsolm.abstractfactory.FoodAbstractFactory;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:06
 */
public class HeyTeaFoodFactory implements FoodAbstractFactory{
    @Override
    public Cola createCola() {
        return new HeyTeaCola();
    }

    @Override
    public Cream creatCream() {
        return new HeyTeaCream();
    }
}
