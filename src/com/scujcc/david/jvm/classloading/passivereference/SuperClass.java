package com.scujcc.david.jvm.classloading.passivereference;

public class SuperClass {
    static {
        System.out.println("Super class init.");
    }

    public static int value = 123;
}
