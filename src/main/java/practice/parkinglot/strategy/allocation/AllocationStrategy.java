package practice.parkinglot.strategy.allocation;

import practice.parkinglot.domain.parkinglot.ParkingSpot;
import practice.parkinglot.domain.vehicle.Vehicle;

import java.util.Map;
import java.util.Optional;

public interface AllocationStrategy {
    Optional<ParkingSpot> allocateSpot(Map<String, ParkingSpot> availableSpots, Vehicle vehicle);
}
