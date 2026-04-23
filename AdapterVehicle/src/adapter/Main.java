package adapter;

public class Main {

    public static void main(String[] args) {

        PriceCalculator car = new CarPriceCalculator(20000);
        PriceCalculator truck = new TruckPriceCalculator(30000);

        System.out.println("Car price: " + car.calculatePrice());
        System.out.println("Truck price: " + truck.calculatePrice());

        UKCarPriceCalculator ukCar = new UKCarPriceCalculator(25000);

        PriceCalculator adapter = new UKCarPriceAdapter(ukCar);

        System.out.println("UK Car price: " + adapter.calculatePrice());

    }

}