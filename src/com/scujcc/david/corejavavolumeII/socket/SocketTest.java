package com.scujcc.david.corejavavolumeII.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by David on 17/3/3.
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        try(Socket socket = new Socket("time-A.timefreq.bldrdoc.gov", 13)){
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
    }
}
