package design_patterns.creational.factory_adapter_pattern;

import design_patterns.creational.factory_adapter_pattern.vechicle_factory.CarFactory;
import design_patterns.creational.factory_adapter_pattern.vechicle_factory.TruckFactory;
import design_patterns.creational.factory_adapter_pattern.vechicle_factory.VehicleFactory;
import design_patterns.creational.factory_pattern.vehicles.Vehicle;

public class AdapterFactoryPatternRunner {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();
        car.stop();

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.start();
        truck.stop();
    }
}
