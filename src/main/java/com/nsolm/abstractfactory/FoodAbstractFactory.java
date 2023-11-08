package com.nsolm.abstractfactory;

import com.nsolm.abstractfactory.heytea.HeyTeaFoodFactory;
import com.nsolm.abstractfactory.naixue.NaixueFoodFactory;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 16:27
 */
public interface FoodAbstractFactory {

    Cola createCola();

    Cream creatCream();

    public static FoodAbstractFactory createFactory(String name){
        if("naixue".equalsIgnoreCase(name)){
            return new NaixueFoodFactory();
        }else if("heytea".equalsIgnoreCase(name)){
            return new HeyTeaFoodFactory();
        }else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
}
