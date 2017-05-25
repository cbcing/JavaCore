package com.scujcc.david.mycode.java8feature.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by David on 5/24/17.
 */

//引用特定对象的实例方法.

public class ReferenceToInstanceMethodOAPO {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here
        List names = new ArrayList();
        names.add("David");
        names.add("Richard");
        names.add("Samuel");
        names.add("Rose");
        names.add("John");

//      ReferenceToInstanceMethodOAPO.printNames(names, x -> System.out.println(x));
        ReferenceToInstanceMethodOAPO.printNames(names,System.out::println);

    }


    private static void printNames(List list, Consumer c ){
        list.forEach(x -> c.accept(x));
    }
}

