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
}
