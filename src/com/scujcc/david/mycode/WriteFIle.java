package com.scujcc.david.mycode;

import java.io.*;
import java.util.Scanner;

/**
 * Created by David on 17/3/3.
 */
public class WriteFIle {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/David/Desktop/jfile.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            String newString = "this is some word!";

            try {
                bufferedWriter.write(newString);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
