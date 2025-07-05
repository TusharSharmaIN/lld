package design_patterns.problems.parking_lot.ParkingLot;

import design_patterns.problems.parking_lot.Vehicle.VehicleType;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(String spotNumber) {
        super(spotNumber, VehicleType.CAR);
    }

}
