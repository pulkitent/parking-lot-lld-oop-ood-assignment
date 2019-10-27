import java.time.LocalDateTime;

public class EntryPoint {
    private final Double id;
    private final ParkingRate rate;

    public EntryPoint(ParkingRate rate) {
        this.id = Math.random();
        this.rate = rate;
    }

    ParkingTicket generateTicket() {
        return new ParkingTicket(LocalDateTime.now(), this.rate);
    }
}