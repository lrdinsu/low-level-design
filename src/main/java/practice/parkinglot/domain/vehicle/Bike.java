package practice.parkinglot.domain.vehicle;

import practice.parkinglot.domain.parkinglot.ParkingSize;

public class Bike extends Vehicle {
    public Bike(String plate) {
        super(plate, ParkingSize.SMALL);
    }
}
