package com.scujcc.david.mycode.serialization;

import java.io.Serializable;

/**
 * Created by David on 5/11/17.
 */

/*
 * 一个类的对象要想序列化成功，必须满足两个条件：
 * 1、该类必须实现 java.io.Serializable 对象。
 * 2、该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 */
public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + "" + address);
    }
}
