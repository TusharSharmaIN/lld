package problems.parking_lot.ParkingLot;

import java.time.Duration;

import problems.parking_lot.Vehicle.Vehicle;
import problems.parking_lot.Vehicle.VehicleType;

public abstract class ParkingSpot {
    String spotNumber;
    boolean isOccupied;
    VehicleType vehicleType;
    Vehicle vehicle;
    long parkingTime;
    long vaccatTime;

    public ParkingSpot(String spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public boolean canParkVehicle(Vehicle vehicle) {
        return (vehicle.getVehicleType() == this.vehicleType && !isOccupied);
    }

    public boolean isSpotOccupied() {
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (isOccupied) {
            throw new IllegalStateException("Spot Already Occupied");
        }

        if (!canParkVehicle(vehicle)) {
            throw new IllegalStateException("Cannot Park in this Spot");
        }

        this.vehicle = vehicle;
        this.isOccupied = true;
        this.parkingTime = System.currentTimeMillis(); // for real-world case
    }

    public void vacateSpot(Vehicle vehicle) {
        if (!isOccupied) {
            throw new IllegalStateException("Spot is Already Vacant");
        }

        this.vehicle = null;
        this.isOccupied = false;
        this.parkingTime = 0;
        this.vaccatTime = 0;
    }

    public Duration getParkingDuration() {
        // for real-world case
        // return Duration.ofMillis(System.currentTimeMillis() - this.parkingTime)
        return Duration.ofHours(2); // mocking for 2 hours
    }

    public String getSpotNumber() {
        return this.spotNumber;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
}
