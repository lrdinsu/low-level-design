package practice.parkinglot.domain.vehicle;

import practice.parkinglot.domain.parkinglot.ParkingSize;

public class Car extends Vehicle {
    public Car(String plate) {
        super(plate, ParkingSize.MEDIUM);

    }
}
