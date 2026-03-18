package factory;

public class BikeBuilder {

    public static void main(String[] args) {

        BikeFactory factory;

        // tạo Mountain Bike
        factory = new MountainBikeFactory();
        Wheel wheel1 = factory.getWheel();
        wheel1.createWheel();

        // tạo Road Bike
        factory = new RoadBikeFactory();
        Wheel wheel2 = factory.getWheel();
        wheel2.createWheel();
        
        factory = new ElectricBikeFactory();
        Wheel wheel3 = factory.getWheel();
        wheel3.createWheel();
    }
}