package adapter;

public class TruckPriceCalculator implements PriceCalculator {

    private double basePrice;

    public TruckPriceCalculator(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.2;
    }

}