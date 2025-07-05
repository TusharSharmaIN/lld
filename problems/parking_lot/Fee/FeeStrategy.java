package problems.parking_lot.Fee;

import java.time.Duration;

import problems.parking_lot.Vehicle.VehicleType;

public interface FeeStrategy {
    double calculateFee(VehicleType vehicleType, Duration duration);
}
