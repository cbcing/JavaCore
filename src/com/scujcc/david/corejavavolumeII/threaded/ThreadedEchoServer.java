package com.scujcc.david.corejavavolumeII.threaded;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by David on 3/11/17.
 */
public class ThreadedEchoServer {
    public static void main(String[] args) {
        try{
            int i = 1;
            ServerSocket serverSocket = new ServerSocket(8198);
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Spawning " + i);
                Runnable runnable = new ThreadedEchoHandler(socket);
                Thread thread = new Thread(runnable);
                thread.start();
                i++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
