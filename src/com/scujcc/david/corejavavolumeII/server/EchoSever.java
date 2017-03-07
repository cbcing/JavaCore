package com.scujcc.david.corejavavolumeII.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by David on 3/7/17.
 */
public class EchoSever {
    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(8198)){
            try (Socket socket = serverSocket.accept()){
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                try (Scanner scanner = new Scanner(inputStream)){
                    PrintWriter printWriter = new PrintWriter(outputStream, true);
                    printWriter.println("hello, i am David! Enter BYE to exit");

                    boolean done = false;
                    while (!done && scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        printWriter.println("Echo: " + line);
                        if (line.trim().endsWith("BYE"))
                            done = true;
                    }
                }
            }
        }
    }
}
