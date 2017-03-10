package com.scujcc.david.thinkinginjava.Runnable_P654;

/**
 * Created by David on 3/8/17.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
