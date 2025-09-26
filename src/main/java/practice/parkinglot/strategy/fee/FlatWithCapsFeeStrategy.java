package practice.parkinglot.strategy.fee;

import practice.parkinglot.domain.parkinglot.ParkingSize;
import practice.parkinglot.domain.parkinglot.ParkingTicket;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlatWithCapsFeeStrategy implements FeeStrategy {

    private static final long MAX_CHANGEABLE_HOURS = 12;
    private final BigDecimal basePerHour;

    public FlatWithCapsFeeStrategy(double basePerHour) {
        this.basePerHour = BigDecimal.valueOf(basePerHour);
    }

    @Override
    public BigDecimal calculateFee(ParkingTicket ticket) {
        long chargeableHours = Math.min(getParkingDurationInHours(ticket), MAX_CHANGEABLE_HOURS);

        ParkingSize size = ticket.getSpot().getSize();
        double sizeFactor = switch (size) {
            case SMALL -> 1.0;
            case MEDIUM -> 1.2;
            case LARGE -> 1.5;
        };

        BigDecimal totalFee = basePerHour.multiply(BigDecimal.valueOf(chargeableHours)).multiply(BigDecimal.valueOf(sizeFactor));

        return totalFee.setScale(2, RoundingMode.HALF_UP);
    }

}
