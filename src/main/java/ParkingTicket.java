import java.math.BigDecimal;
import java.time.LocalDateTime;

class ParkingTicket {
    private final Double id;
    private final LocalDateTime entryTime;
    private final ParkingRate rate;

    ParkingTicket(LocalDateTime entryTime, ParkingRate rate) {
        this.id = Math.random();
        this.entryTime = entryTime;
        this.rate = rate;
    }

    BigDecimal calculateAmount() {
        return null;
    }
}