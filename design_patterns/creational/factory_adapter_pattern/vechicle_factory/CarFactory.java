package design_patterns.creational.factory_adapter_pattern.vechicle_factory;

import design_patterns.creational.factory_pattern.vehicles.Car;
import design_patterns.creational.factory_pattern.vehicles.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
