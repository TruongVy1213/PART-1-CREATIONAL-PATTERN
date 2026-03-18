package factory;

public class MountainBikeWheel implements Wheel {

    @Override
    public void createWheel() {
        System.out.println("Mountain Bike Wheel created");
    }
}