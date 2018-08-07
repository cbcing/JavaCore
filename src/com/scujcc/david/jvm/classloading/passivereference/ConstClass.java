package com.scujcc.david.jvm.classloading.passivereference;

public class ConstClass {
    static {
        System.out.println("Const class init.");
    }

    public static final String HELLO = "CONSTCLASS.";
}
