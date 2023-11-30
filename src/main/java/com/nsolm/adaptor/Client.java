package com.nsolm.adaptor;

import java.util.concurrent.FutureTask;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 18:14
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Task task = new Task(10);
        Thread thread = new Thread(new RunnableAdapter(task));
        thread.start();
    }
}
