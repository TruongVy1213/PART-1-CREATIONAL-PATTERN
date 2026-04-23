package adapter;

public class UKCarPriceCalculator {

    private double basePrice;

    public UKCarPriceCalculator(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPrice() {
        return basePrice * 0.8;
    }

}