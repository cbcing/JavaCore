package com.scujcc.david.corejavavolumeII.inetAddress;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by David on 3/7/17.
 */
public class InetAddressTest {
    public static void main(String[] args) throws IOException {
        if (args.length > 0){
            String host = args[0];
            InetAddress[] address = InetAddress.getAllByName(host);
            for (InetAddress a : address)
                System.out.println(a);
        } else {
            InetAddress localHostAddress = InetAddress.getLocalHost();
            System.out.println(localHostAddress);
        }
    }
}
