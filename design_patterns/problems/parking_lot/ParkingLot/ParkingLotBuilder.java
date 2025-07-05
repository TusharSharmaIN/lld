package design_patterns.problems.parking_lot.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotBuilder {
    List<ParkingFloor> floors;

    public ParkingLotBuilder() {
        this.floors = new ArrayList<>();
    }

    public ParkingLotBuilder addFloor(ParkingFloor floor) {
        this.floors.add(floor);
        return this;
    }

    public ParkingLotBuilder createFloor(int floorNumber, int numOfCarSpots, int numOfBikeSpots, int numOfTruckSpots) {
        ParkingFloor floor = new ParkingFloor(floorNumber);

        for (int i = 0; i < numOfCarSpots; i++) {
            floor.addParkingSpots(new CarParkingSpot(getSpotNumberHelper("C", floorNumber, i + 1)));
        }

        for (int i = 0; i < numOfBikeSpots; i++) {
            floor.addParkingSpots(new BikeParkingSpot(getSpotNumberHelper("B", floorNumber, i + 1)));
        }

        for (int i = 0; i < numOfTruckSpots; i++) {
            floor.addParkingSpots(new TruckParkingSpot(getSpotNumberHelper("T", floorNumber, i + 1)));
        }

        this.floors.add(floor);
        return this;
    }

    public ParkingLot build() {
        return new ParkingLot(this.floors);
    }

    // returns floor number + spot number
    String getSpotNumberHelper(String prefix, int floorNumber, int num) {
        return prefix + Integer.toString(floorNumber) + Integer.toString(num);
    }

}
