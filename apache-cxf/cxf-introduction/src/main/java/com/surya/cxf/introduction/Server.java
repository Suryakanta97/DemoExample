package com.surya.cxf.introduction;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String args[]) throws InterruptedException {
        SuryaImpl implementor = new SuryaImpl();
        String address = "http://localhost:8080/surya";
        Endpoint.publish(address, implementor);
        System.out.println("Server ready...");
        Thread.sleep(60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}