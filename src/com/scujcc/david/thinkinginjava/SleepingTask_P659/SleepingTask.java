package com.scujcc.david.thinkinginjava.SleepingTask_P659;

import com.scujcc.david.thinkinginjava.Runnable_P654.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by David on 3/13/17.
 */
public class SleepingTask extends LiftOff{
    public void run(){
        while (countDown-- > 0){
            System.out.print(status());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new SleepingTask());
        exec.shutdown();
    }
}
