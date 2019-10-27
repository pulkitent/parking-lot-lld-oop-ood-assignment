import java.math.BigDecimal;

public class Customer {
    private final Double id;
    private final Vehicle vehicle;
    private final ParkingTicket ticket;

    public Customer(Vehicle vehicle, ParkingTicket ticket) {
        this.id = Math.random();
        this.vehicle = vehicle;
        this.ticket = ticket;
    }

    void doPayment() {
        BigDecimal amountToPay = this.ticket.calculateAmount();
    }
}