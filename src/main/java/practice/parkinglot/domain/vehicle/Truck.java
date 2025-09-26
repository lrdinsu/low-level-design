package practice.parkinglot.domain.vehicle;

import practice.parkinglot.domain.parkinglot.ParkingSize;

public class Truck extends Vehicle {
    public Truck(String plate) {
        super(plate, ParkingSize.LARGE);
    }
}
