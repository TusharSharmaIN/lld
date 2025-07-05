package design_patterns.problems.parking_lot.Vehicle;

import java.time.Duration;

import design_patterns.problems.parking_lot.Fee.FeeStrategy;

public class Vehicle {
    VehicleType vehicleType;
    String licenseNumber;
    FeeStrategy feeStrategy;

    public Vehicle(VehicleType vehicleType, String licenseNumber, FeeStrategy feeStrategy) {
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
        this.feeStrategy = feeStrategy;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicense() {
        return licenseNumber;
    }

    public double calculateFee(Duration duration) {
        return feeStrategy.calculateFee(this.vehicleType, duration);
    }
}