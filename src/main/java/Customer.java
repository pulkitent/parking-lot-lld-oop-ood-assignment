public class Customer {
    private final Integer id;
    private final Vehicle vehicle;
    private final ParkingTicket ticket;

    public Customer(Integer id, Vehicle vehicle, ParkingTicket ticket) {
        this.id = id;
        this.vehicle = vehicle;
        this.ticket = ticket;
    }
}
