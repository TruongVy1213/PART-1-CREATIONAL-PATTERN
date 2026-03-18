package com.pattern.singleton;

public class PrintSpooler {

    private static PrintSpooler instance;

    // constructor private
    private PrintSpooler() {
        init();
    }

    // initialization
    private void init() {
        System.out.println("PrintSpooler initialized");
    }

    // singleton method
    public static synchronized PrintSpooler getInstance() {

        if (instance == null) {
            instance = new PrintSpooler();
        }

        return instance;
    }

    public void printDocument(String file) {
        System.out.println("Printing: " + file);
    }
}