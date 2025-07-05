package design_patterns.problems.parking_lot.Fee;

import java.time.Duration;

import design_patterns.problems.parking_lot.Vehicle.VehicleType;

public interface FeeStrategy {
    double calculateFee(VehicleType vehicleType, Duration duration);
}
