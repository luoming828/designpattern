package com.nsolm.adaptor;

import java.util.concurrent.Callable;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 18:11
 */
public class Task implements Callable<Long> {
    private int num;

    public Task(int num){
        this.num = num;
    }
    @Override
    public Long call() throws Exception {
        Long sum = 0L;
        while(0 <= num){
            sum++;
            num--;
        }
        System.out.println("Result:"+sum);
        return sum;
    }
}
