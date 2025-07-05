package design_patterns.problems.parking_lot.Vehicle;

import design_patterns.problems.parking_lot.Fee.FeeStrategy;

public class CarVehicle extends Vehicle {

    public CarVehicle(String licenseNumber, FeeStrategy feeStrategy) {
        super(VehicleType.CAR, licenseNumber, feeStrategy);
    }
}
