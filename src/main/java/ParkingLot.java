import java.util.List;

public class ParkingLot {
    private final List<ParkingFloor> parkingFloors;
    private final List<EntryPoint> entryPoints;
    private final List<EntryPoint> exitPoints;

    public ParkingLot(List<ParkingFloor> parkingFloors, List<EntryPoint> entryPoints, List<EntryPoint> exitPoints) {
        this.parkingFloors = parkingFloors;
        this.entryPoints = entryPoints;
        this.exitPoints = exitPoints;
    }
}
