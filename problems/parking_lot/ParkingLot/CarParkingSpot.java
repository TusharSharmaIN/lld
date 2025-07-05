package problems.parking_lot.ParkingLot;

import problems.parking_lot.Vehicle.VehicleType;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(String spotNumber) {
        super(spotNumber, VehicleType.CAR);
    }

}
