package problems.parking_lot.ParkingLot;

import problems.parking_lot.Vehicle.VehicleType;

public class TruckParkingSpot extends ParkingSpot {

    public TruckParkingSpot(String spotNumber) {
        super(spotNumber, VehicleType.TRUCK);
    }

}
