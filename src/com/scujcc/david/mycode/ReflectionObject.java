package com.scujcc.david.mycode;

import com.scujcc.david.justtest.Employee;

import java.lang.reflect.Field;

/**
 * Created by David on 17/3/4.
 */
public class ReflectionObject {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Class c = employee.getClass();

        employee.setName("David");
        employee.setAge(22);

        try {
            Field f1 = c.getDeclaredField("name");
            f1.setAccessible(true);
            Field f2 = c.getDeclaredField("age");
            f2.setAccessible(true);

            try {
                String name = (String)f1.get(employee);
                double age = f2.getDouble(employee);

                System.out.println(name + ", " + age);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
