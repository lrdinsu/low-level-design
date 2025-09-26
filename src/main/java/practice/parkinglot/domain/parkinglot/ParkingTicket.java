package practice.parkinglot.domain.parkinglot;

import practice.parkinglot.domain.vehicle.Vehicle;

import java.time.Instant;
import java.util.UUID;

public class ParkingTicket {
    private final String ticketId = UUID.randomUUID().toString();
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final Instant entryTime = Instant.now();
    private Instant exitTime;

    public ParkingTicket(Vehicle vehicle, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public Instant getEntryTime() {
        return entryTime;
    }

    public Instant getExitTime() {
        return exitTime;
    }

    public void setExitTime() {
        exitTime = Instant.now();
    }


}
