package design_patterns.creational.factory_pattern;

import design_patterns.creational.factory_pattern.vehicles.Vehicle;

public class FactoryPatternRunner {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        Vehicle bike = VehicleFactory.getVehicle("bike");
        Vehicle truck = VehicleFactory.getVehicle("truck");
        
        car.start();
        bike.start();
        truck.start();

        car.stop();
        bike.stop();
        truck.stop();
    }
}