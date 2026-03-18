package factorypattern;

public class CandyFactory {

    public static Candy createCandy(String type) {

        if(type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCandy();
        }

        if(type.equalsIgnoreCase("caramel")) {
            return new CaramelCandy();
        }

        if(type.equalsIgnoreCase("mint")) {
            return new MintCandy();
        }

        return null;
    }

}