package factory;

public class ElectricBikeFactory implements BikeFactory {

    @Override
    public Wheel getWheel() {
        return new ElectricBikeWheel();
    }
}