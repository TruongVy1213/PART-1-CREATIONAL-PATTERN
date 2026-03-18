package com.pattern.singleton;

public class NetworkConnector {

    private static NetworkConnector instance;

    private NetworkConnector() {
        System.out.println("Network connector created");
    }

    public static synchronized NetworkConnector getInstance() {

        if (instance == null) {
            instance = new NetworkConnector();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connecting to network...");
    }
}