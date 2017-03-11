package com.scujcc.david.corejavavolumeII.threaded;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by David on 3/11/17.
 */
public class ThreadedEchoHandler implements Runnable {
    private Socket socket;

    public ThreadedEchoHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
            //面向服务器输入
            InputStream inputStream = socket.getInputStream();
            //面向客服端输出
            OutputStream outputStream = socket.getOutputStream();

            //使用Scanner扫描输入（向客户端）
            Scanner scanner = new Scanner(inputStream);
            //使用PrintWriter输出（向客服端）
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            printWriter.println("Hello: Enter BYE to exit!");

            boolean done = false;
            while (!done && scanner.hasNext()){
                String line = scanner.nextLine();
                printWriter.println("Echo: " + line);
                if (line.trim().equals("BYE"))
                    done = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
