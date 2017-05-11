package com.scujcc.david.mycode.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by David on 5/11/17.
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/David/IdeaProjects/JavaCore/src/com/scujcc/david/mycode/serialization/employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(e);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.printf("/Users/David/IdeaProjects/JavaCore/src/com/scujcc/david/mycode/serialization/employee.ser");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
