package problems.parking_lot.Fee;

import java.time.Duration;

import problems.parking_lot.Vehicle.VehicleType;

public class StaffFeeStrategy implements FeeStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, Duration duration) {
        switch (vehicleType) {
            case BIKE:
                return duration.toHours() * 0;
            case CAR:
                return duration.toHours() * 0.5;
            case TRUCK:
                return duration.toHours() * 1.0;
            default:
                return 0.0;
        }
    }
}
