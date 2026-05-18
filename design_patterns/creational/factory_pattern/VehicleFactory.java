package design_patterns.creational.factory_pattern;

import design_patterns.creational.factory_pattern.vehicles.Bike;
import design_patterns.creational.factory_pattern.vehicles.Car;
import design_patterns.creational.factory_pattern.vehicles.Truck;
import design_patterns.creational.factory_pattern.vehicles.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}