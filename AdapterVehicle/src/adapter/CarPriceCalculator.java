package adapter;

public class CarPriceCalculator implements PriceCalculator {

    private double basePrice;

    public CarPriceCalculator(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.1;
    }

}