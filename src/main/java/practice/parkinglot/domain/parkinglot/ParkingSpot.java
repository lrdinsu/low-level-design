package practice.parkinglot.domain.parkinglot;

import practice.parkinglot.domain.vehicle.Vehicle;

public class ParkingSpot {
    private final String id;
    private final int level;
    private final ParkingSize size;
    private boolean isOccupied;


    public ParkingSpot(String id, int level, ParkingSize size) {
        this.id = id;
        this.level = level;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public ParkingSize getSize() {
        return size;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void markOccupied() {
        isOccupied = true;
    }

    public void markFree() {
        isOccupied = false;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return size.canFit(vehicle.getSize());
    }
}
