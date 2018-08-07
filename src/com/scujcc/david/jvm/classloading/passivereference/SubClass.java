package com.scujcc.david.jvm.classloading.passivereference;

public class SubClass extends SuperClass {
    static {
        System.out.println("Sub class init.");
    }
}
