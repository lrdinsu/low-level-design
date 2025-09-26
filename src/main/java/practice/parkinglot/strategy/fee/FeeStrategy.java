package practice.parkinglot.strategy.fee;

import practice.parkinglot.domain.parkinglot.ParkingTicket;

import java.math.BigDecimal;
import java.time.Duration;

public interface FeeStrategy {
    BigDecimal calculateFee(ParkingTicket ticket);

    default long getParkingDurationInHours(ParkingTicket ticket) {
        Duration duration = Duration.between(ticket.getEntryTime(), ticket.getExitTime());
        return Math.max(1, duration.plusMinutes(59).toHours());
    }
}
