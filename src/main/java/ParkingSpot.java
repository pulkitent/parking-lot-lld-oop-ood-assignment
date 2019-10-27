public class ParkingSpot {
    private final Integer id;
    private final ParkingSpot type;
    private final Vehicle vehicle;

    public ParkingSpot(Integer id, ParkingSpot type, Vehicle vehicle) {
        this.id = id;
        this.type = type;
        this.vehicle = vehicle;
    }
}
