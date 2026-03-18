package factory;

public class RoadBikeWheel implements Wheel {

    @Override
    public void createWheel() {
        System.out.println("Road Bike Wheel created");
    }
}