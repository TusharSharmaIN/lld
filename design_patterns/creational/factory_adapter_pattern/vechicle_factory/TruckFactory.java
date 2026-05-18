package design_patterns.creational.factory_adapter_pattern.vechicle_factory;

import design_patterns.creational.factory_pattern.vehicles.Truck;
import design_patterns.creational.factory_pattern.vehicles.Vehicle;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
    
}
