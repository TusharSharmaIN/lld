package problems.parking_lot.Vehicle;

import problems.parking_lot.Fee.FeeStrategy;

public class BikeVehicle extends Vehicle {

    public BikeVehicle(String licenseNumber, FeeStrategy feeStrategy) {
        super(VehicleType.BIKE, licenseNumber, feeStrategy);
    }

}
