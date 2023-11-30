package com.nsolm.adaptor;

import java.util.concurrent.Callable;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 18:15
 */
public class RunnableAdapter implements Runnable{

    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
