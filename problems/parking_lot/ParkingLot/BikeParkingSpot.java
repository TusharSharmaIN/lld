package problems.parking_lot.ParkingLot;

import problems.parking_lot.Vehicle.VehicleType;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(String spotNumber) {
        super(spotNumber, VehicleType.BIKE);
    }

}
