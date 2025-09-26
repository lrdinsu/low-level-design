package practice.parkinglot;

import practice.parkinglot.domain.parkinglot.ParkingSize;
import practice.parkinglot.domain.parkinglot.ParkingSpot;
import practice.parkinglot.domain.parkinglot.ParkingTicket;
import practice.parkinglot.domain.vehicle.Car;
import practice.parkinglot.service.ParkingLotService;
import practice.parkinglot.strategy.allocation.AllocationStrategy;
import practice.parkinglot.strategy.allocation.NearestFirstAllocationStrategy;
import practice.parkinglot.strategy.fee.FeeStrategy;
import practice.parkinglot.strategy.fee.FlatWithCapsFeeStrategy;

import java.math.BigDecimal;

public class ParkingLotDemo {
    public static void main(String[] args) throws InterruptedException {
        FeeStrategy feeStrategy = new FlatWithCapsFeeStrategy(4.0);
        AllocationStrategy allocationStrategy = new NearestFirstAllocationStrategy();

        ParkingLotService parkingLot = new ParkingLotService(allocationStrategy, feeStrategy);
        parkingLot.addParkingSpot(new ParkingSpot("a1", 1, ParkingSize.SMALL));
        parkingLot.addParkingSpot(new ParkingSpot("a2", 1, ParkingSize.MEDIUM));
        parkingLot.addParkingSpot(new ParkingSpot("a3", 2, ParkingSize.LARGE));

        Car test1 = new Car("KA-01-HH-1234");
        ParkingTicket ticket = parkingLot.parkVehicle(test1);
        System.out.println("Ticket issued: " + ticket.getTicketId());

        Thread.sleep(10000);

        BigDecimal fee = parkingLot.exitVehicle(test1);
        System.out.println(fee);

    }
}
