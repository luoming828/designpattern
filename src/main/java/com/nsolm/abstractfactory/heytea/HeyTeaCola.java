package com.nsolm.abstractfactory.heytea;

import com.nsolm.abstractfactory.Cola;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:04
 */
public class HeyTeaCola implements Cola {
    @Override
    public void createCola() {
        System.out.println("喜茶可乐");
    }

}
