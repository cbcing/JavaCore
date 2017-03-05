package com.scujcc.david.mycode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by David on 17/3/3.
 */
public class WriteFileFunctionTwo {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("/Users/David/Desktop/jfile.txt");

            printWriter.println("hello, i am david!");
            printWriter.println("i love java language!");

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
