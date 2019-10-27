import java.util.List;

public class ParkingFloor {
    private final List<ParkingSpot> emptyParkingSpots;
    private final List<ParkingSpot> occupiedParkingSpots;
    private final DisplayBoard displayBoard;

    public ParkingFloor(List<ParkingSpot> emptyParkingSpots, List<ParkingSpot> occupiedParkingSpots, DisplayBoard displayBoard) {
        this.emptyParkingSpots = emptyParkingSpots;
        this.occupiedParkingSpots = occupiedParkingSpots;
        this.displayBoard = displayBoard;
    }

    void showDisplay() {
        if (emptyParkingSpots.isEmpty())
            this.displayBoard.showAvailability("This floor is full");
        else {
            this.displayBoard.showAvailability("Remaining spots for thsi fllor is: " +
                    emptyParkingSpots.size());
        }
    }

    ParkingSpot parkVehicle(Vehicle vehicle) throws RuntimeException {
        if (emptyParkingSpots.isEmpty()) {
            throw new RuntimeException("This floor is full");
        }

        ParkingSpot parkingSpot = emptyParkingSpots.get(0);
        parkingSpot.parkVehicle(vehicle);

        occupiedParkingSpots.add(parkingSpot);
        emptyParkingSpots.remove(parkingSpot);

        return parkingSpot;
    }

    Vehicle unParkVehicle(ParkingSpot parkingSpot) throws RuntimeException {
        if (occupiedParkingSpots.isEmpty()) {
            throw new RuntimeException("No vehicle exists");
        }

        Vehicle vehicle = parkingSpot.unParkVehicle();

        occupiedParkingSpots.remove(parkingSpot);
        emptyParkingSpots.add(parkingSpot);

        return vehicle;
    }

    Boolean hasSpace() {
        return this.emptyParkingSpots.isEmpty();
    }

    Boolean hasGivenParkingSpot(ParkingSpot parkingSpot) {
        return this.occupiedParkingSpots.contains(parkingSpot);
    }
}