import java.util.List;

public class ParkingLot {
    private final List<ParkingFloor> parkingFloors;
    private final List<EntryPoint> entryPoints;
    private final List<EntryPoint> exitPoints;
    private final EntrancePanel entrancePanel;

    public ParkingLot(List<ParkingFloor> parkingFloors, List<EntryPoint> entryPoints,
                      List<EntryPoint> exitPoints) {
        this.parkingFloors = parkingFloors;
        this.entryPoints = entryPoints;
        this.exitPoints = exitPoints;
        this.entrancePanel = new EntrancePanel();
    }

    ParkingSpot parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : parkingFloors) {
            if (floor.hasSpace(vehicle)) {
                ParkingSpot parkingSpot = floor.parkVehicle(vehicle);
                return parkingSpot;
            }
        }

        throw new RuntimeException("All floors are already full");
    }

    Vehicle unParkVehicle(ParkingSpot parkingSpot) {
        for (ParkingFloor floor : parkingFloors) {
            if (floor.hasGivenParkingSpot(parkingSpot)) {
                floor.unParkVehicle(parkingSpot);
            }
        }

        throw new RuntimeException("Either this parking spot doesn't exist or it's empty");
    }

    Boolean isNotFull() {
        for (ParkingFloor parkingFloor : this.parkingFloors) {
            if (parkingFloor.isNotFull())
                return true;
        }
        return false;
    }
}