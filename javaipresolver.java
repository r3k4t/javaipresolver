
import java.net.*;
import java.io.*;
import java.util.Scanner;


public class IP_RESOLVER{

 
    public static void main (String args[]) throws Exception{
    System.out.println("=======================================");
    System.out.println("|          JAVA IP RESOLVER           |");
    System.out.println("=======================================");
    System.out.println("|   Author : Rahat Khan Tusar(rkt)    |");
    System.out.println("|   Github : https://github.com/r3k4t |");
    System.out.println("=======================================");
    String hostname;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a website name(Ex👉️:www.google.com):");
    hostname=sc.next();
    InetAddress address = InetAddress.getByName(hostname); 
    System.out.println(address.getHostAddress());

     }


}
