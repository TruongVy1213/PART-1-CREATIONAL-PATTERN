package facade;

public class VacationFacade {

    private FlightBooking flight;
    private HotelBooking hotel;
    private CarRental car;

    public VacationFacade() {
        flight = new FlightBooking();
        hotel = new HotelBooking();
        car = new CarRental();
    }

    public void bookVacation() {
        flight.bookFlight();
        hotel.bookHotel();
        car.rentCar();
    }
}