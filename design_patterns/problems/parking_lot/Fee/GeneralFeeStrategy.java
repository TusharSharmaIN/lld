package design_patterns.problems.parking_lot.Fee;

import java.time.Duration;

import design_patterns.problems.parking_lot.Vehicle.VehicleType;

public class GeneralFeeStrategy implements FeeStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, Duration duration) {
        switch (vehicleType) {
            case BIKE:
                return duration.toHours() * 1.0;
            case CAR:
                return duration.toHours() * 2.0;
            case TRUCK:
                return duration.toHours() * 4.0;
            default:
                return 0.0;
        }
    }

}
