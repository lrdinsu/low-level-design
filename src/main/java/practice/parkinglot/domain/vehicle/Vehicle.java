package practice.parkinglot.domain.vehicle;

import practice.parkinglot.domain.parkinglot.ParkingSize;

public abstract class Vehicle {
    private final String plate;
    private final ParkingSize size;

    public Vehicle(String plate, ParkingSize size) {
        this.plate = plate;
        this.size = size;
    }

    public String getPlate() {
        return plate;
    }

    public ParkingSize getSize() {
        return size;
    }

}
