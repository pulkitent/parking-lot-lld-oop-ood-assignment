import java.math.BigDecimal;

public class ExitPoint {
    private final Double id;

    public ExitPoint() {
        this.id = Math.random();
    }

    void scanTicket(ParkingTicket ticket) {
        BigDecimal amountToBePaid = ticket.calculateAmount();
    }
}