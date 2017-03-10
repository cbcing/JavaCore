package com.scujcc.david.thinkinginjava.Runnable_P654;

/**
 * Created by David on 3/8/17.
 */
public class BasicThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();

        String threadName = thread.getName();
        long threadId = thread.getId();

        System.out.println(threadName + " " + threadId);
        System.out.println("Waitng for LiftOff");
    }
}
