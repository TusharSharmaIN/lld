package design_patterns.creational.factory_pattern.vehicles;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
}