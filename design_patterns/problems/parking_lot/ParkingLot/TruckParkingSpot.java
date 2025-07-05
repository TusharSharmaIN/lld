package design_patterns.problems.parking_lot.ParkingLot;

import design_patterns.problems.parking_lot.Vehicle.VehicleType;

public class TruckParkingSpot extends ParkingSpot {

    public TruckParkingSpot(String spotNumber) {
        super(spotNumber, VehicleType.TRUCK);
    }

}
