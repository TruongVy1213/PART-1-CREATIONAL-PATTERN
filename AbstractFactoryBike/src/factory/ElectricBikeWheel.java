package factory;

public class ElectricBikeWheel implements Wheel {

    @Override
    public void createWheel() {
        System.out.println("Electric Bike Wheel created");
    }
}