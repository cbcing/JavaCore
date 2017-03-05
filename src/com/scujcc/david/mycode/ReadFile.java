package com.scujcc.david.mycode;

import java.io.*;

/**
 * Created by David on 17/3/3.
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/users/David/Desktop/jfile.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            try {
                while ((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
