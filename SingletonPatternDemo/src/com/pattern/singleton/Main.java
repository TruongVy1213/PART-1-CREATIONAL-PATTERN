package com.pattern.singleton;

public class Main {

    public static void main(String[] args) {

        PrintSpooler ps1 = PrintSpooler.getInstance();
        PrintSpooler ps2 = PrintSpooler.getInstance();

        ps1.printDocument("Report.pdf");

        System.out.println(ps1 == ps2);

        NetworkConnector nc1 = NetworkConnector.getInstance();
        NetworkConnector nc2 = NetworkConnector.getInstance();

        nc1.connect();

        System.out.println(nc1 == nc2);
    }
}