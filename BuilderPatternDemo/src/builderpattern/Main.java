package builderpattern;

public class Main {

    public static void main(String[] args) {

        Architect architect = new Architect();

        Bedroom bedroom = architect.buildBedroom();

        System.out.println(bedroom);
    }
}