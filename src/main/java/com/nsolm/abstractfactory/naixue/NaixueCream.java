package com.nsolm.abstractfactory.naixue;

import com.nsolm.abstractfactory.Cream;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:02
 */
public class NaixueCream implements Cream {

    @Override
    public void createCream() {
        System.out.println("奈雪的奶油");
    }
}
