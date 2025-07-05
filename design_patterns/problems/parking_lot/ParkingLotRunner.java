package design_patterns.problems.parking_lot;

import java.util.Scanner;

import design_patterns.problems.parking_lot.Fee.*;
import design_patterns.problems.parking_lot.ParkingLot.*;
import design_patterns.problems.parking_lot.Payment.*;
import design_patterns.problems.parking_lot.Vehicle.*;

public class ParkingLotRunner {
    public static void main(String[] args) {
        // Initialize parking spots
        // List<ParkingSpot> parkingSpots = new ArrayList<>();
        // parkingSpots.add(new CarParkingSpot(11));
        // parkingSpots.add(new CarParkingSpot(12));
        // parkingSpots.add(new BikeParkingSpot(13));
        // parkingSpots.add(new BikeParkingSpot(14));
        // parkingSpots.add(new BikeParkingSpot(15));
        // parkingSpots.add(new TruckParkingSpot(16));

        // Initialize parking lot
        ParkingLot parkingLot = new ParkingLotBuilder().createFloor(1, 2, 3, 1).createFloor(2, 2, 4, 2).build();
        // Create fee strategies
        FeeStrategy generalFeeStrategy = new GeneralFeeStrategy();
        FeeStrategy staffFeeStrategy = new StaffFeeStrategy();

        // Create vehicles using Factory Pattern with fee strategies
        Vehicle car1 = VehicleFactory.createVehicle(VehicleType.CAR, "CAR123", generalFeeStrategy);
        // Vehicle car2 = VehicleFactory.createVehicle(VehicleType.CAR, "CAR345",
        // generalFeeStrategy);

        Vehicle bike1 = VehicleFactory.createVehicle(VehicleType.BIKE, "BIKE456", staffFeeStrategy);
        // Vehicle bike2 = VehicleFactory.createVehicle(VehicleType.BIKE, "BIKE123",
        // staffFeeStrategy);

        Vehicle truck1 = VehicleFactory.createVehicle(VehicleType.TRUCK, "TRUCK456", generalFeeStrategy);
        Vehicle truck2 = VehicleFactory.createVehicle(VehicleType.TRUCK, "TRUCK786", generalFeeStrategy);
        // staffFeeStrategy);

        // Park vehicles
        ParkingSpot carSpot = parkingLot.parkVehicle(car1);
        ParkingSpot bikeSpot = parkingLot.parkVehicle(bike1);
        ParkingSpot truckSpot = parkingLot.parkVehicle(truck1);
        ParkingSpot truckSpot2 = parkingLot.parkVehicle(truck2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method for your vehicle: ");
        System.out.println("1. Card");
        System.out.println("2. UPI");
        int paymentMethod = scanner.nextInt();
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentMethod);

        // Process payments using Strategy Patterns
        if (carSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double carFee = car1.calculateFee(carSpot.getParkingDuration());
            paymentStrategy.processPayment(carFee);
            parkingLot.vacateSpot(carSpot, car1);
        }
        if (bikeSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double bikeFee = bike1.calculateFee(bikeSpot.getParkingDuration());
            paymentStrategy.processPayment(bikeFee);
            parkingLot.vacateSpot(bikeSpot, bike1);
        }
        if (truckSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double truckFee = truck1.calculateFee(truckSpot.getParkingDuration());
            paymentStrategy.processPayment(truckFee);
            parkingLot.vacateSpot(truckSpot, truck1);
        }
        if (truckSpot2 != null) {
            // Calculate fee using the specific strategy for the vehicle
            double truckFee2 = truck1.calculateFee(truckSpot2.getParkingDuration());
            paymentStrategy.processPayment(truckFee2);
            parkingLot.vacateSpot(truckSpot2, truck1);
        }
        scanner.close();
    }

    private static PaymentStrategy getPaymentStrategy(int paymentMethod) {
        double cardProcessingFee = 0.01;

        switch (paymentMethod) {
            case 1:
                return new CardPaymentStrategy(cardProcessingFee);
            case 2:
                return new UPIPaymentStrategy();
            default:
                System.out.println("Invalid choice! Default to UPI payment");
                return new UPIPaymentStrategy();
        }
    }
}
