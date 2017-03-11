package com.scujcc.david.thinkinginjava.Runnable_P654;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by David on 3/11/17.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++){
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
