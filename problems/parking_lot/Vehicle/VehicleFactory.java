package problems.parking_lot.Vehicle;

import problems.parking_lot.Fee.FeeStrategy;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType vehicleType, String licenseNumber, FeeStrategy feeStrategy) {
        return switch (vehicleType) {
            case BIKE -> new BikeVehicle(licenseNumber, feeStrategy);
            case CAR -> new CarVehicle(licenseNumber, feeStrategy);
            case TRUCK -> new TruckVehicle(licenseNumber, feeStrategy);
            default -> throw new IllegalArgumentException("Unknown vechicle Type");
        };
    }

}
