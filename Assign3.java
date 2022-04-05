package JAVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {


            try {
                String ipAddress = "8.8.8.8";
                InetAddress inet = InetAddress.getByName(ipAddress);
                System.out.println("Inet" + inet);

                System.out.println("Sending Ping Request to " + ipAddress);

                long finish = 0;
                long start = new GregorianCalendar().getTimeInMillis();
                System.out.println(start);
                if (inet.isReachable(10000)){
                    finish = new GregorianCalendar().getTimeInMillis();
                    System.out.println("Ping Avg. Round Time Trip: " + ((finish - start) / 2) + "ms");
                } else {
                    System.out.println(ipAddress + " Not reachable.");
                }
            } catch ( Exception e ) {
                System.out.println("Exception:" + e.getMessage());
            }
        }



}
