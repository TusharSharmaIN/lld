package design_patterns.creational.factory_adapter_pattern.vechicle_factory;

import design_patterns.creational.factory_pattern.vehicles.Vehicle;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new design_patterns.creational.factory_pattern.vehicles.Bike();
    }
}