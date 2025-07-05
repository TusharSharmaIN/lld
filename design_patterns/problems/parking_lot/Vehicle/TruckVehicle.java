package design_patterns.problems.parking_lot.Vehicle;

import design_patterns.problems.parking_lot.Fee.FeeStrategy;

public class TruckVehicle extends Vehicle {

    public TruckVehicle(String licenseNumber, FeeStrategy feeStrategy) {
        super(VehicleType.TRUCK, licenseNumber, feeStrategy);
    }

}
