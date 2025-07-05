package problems.parking_lot.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import problems.parking_lot.Vehicle.VehicleType;

public class ParkingFloor {
    List<ParkingSpot> spots = new ArrayList<>();
    int floorNumber;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addParkingSpots(ParkingSpot spot) {
        this.spots.add(spot);
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for (ParkingSpot spot : this.spots) {
            if (!spot.isSpotOccupied() && spot.vehicleType == vehicleType) {
                return spot;
            }
        }
        return null;
    }

    public List<ParkingSpot> getPrkingSpots() {
        return this.spots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

}
