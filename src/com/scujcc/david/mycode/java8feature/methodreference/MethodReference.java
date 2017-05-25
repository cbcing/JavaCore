package com.scujcc.david.mycode.java8feature.methodreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 5/11/17.
 */
// java8 新特性 －－ 方法引用。
public class MethodReference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //使用方法引用。
        list.forEach(System.out::println);
    }
}
