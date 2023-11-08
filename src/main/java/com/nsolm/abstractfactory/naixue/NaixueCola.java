package com.nsolm.abstractfactory.naixue;

import com.nsolm.abstractfactory.Cola;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:03
 */
public class NaixueCola implements Cola {
    @Override
    public void createCola() {
        System.out.println("奈雪的可乐");
    }
}
