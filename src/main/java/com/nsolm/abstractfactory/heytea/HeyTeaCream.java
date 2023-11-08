package com.nsolm.abstractfactory.heytea;

import com.nsolm.abstractfactory.Cream;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:05
 */
public class HeyTeaCream implements Cream {
    @Override
    public void createCream() {
        System.out.println("喜茶奶油");
    }
}
