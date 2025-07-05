package design_patterns.problems.parking_lot.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import design_patterns.problems.parking_lot.Vehicle.Vehicle;
import design_patterns.problems.parking_lot.Vehicle.VehicleType;

public class ParkingLot {
    List<ParkingFloor> floors = new ArrayList<>();

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for (ParkingFloor floor : this.floors) {
            ParkingSpot spot = floor.findAvailableSpot(vehicleType);
            if (spot != null) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = this.findAvailableSpot(vehicle.getVehicleType());

        if (spot != null) {
            spot.parkVehicle(vehicle);
            System.out.println(
                    vehicle.getVehicleType().toString() + " parked successfully in spot: " + spot.getSpotNumber());
            return spot;
        }
        System.out.println("There's no parking spot available for " + vehicle.getVehicleType().toString());
        return null;
    }

    public void vacateSpot(ParkingSpot spot, Vehicle vehicle) {
        if (spot != null && spot.isSpotOccupied() && spot.vehicleType == vehicle.getVehicleType()) {
            spot.vacateSpot(vehicle);
            System.out.println(vehicle.getVehicleType().toString() + " unparked succesfuly");
        } else {
            System.out.println("Error while vacating spot " + spot.getSpotNumber());
        }
    }

    public ParkingSpot getParkingSpotByNumber(String spotNumber) {
        for (ParkingFloor floor : this.floors) {
            for (ParkingSpot spot : floor.getPrkingSpots()) {
                if (spot.getSpotNumber().equalsIgnoreCase(spotNumber)) {
                    return spot;
                }
            }
        }
        return null;
    }

    public List<ParkingFloor> getFloors() {
        return this.floors;
    }
}
