package practice.parkinglot.domain.parkinglot;

import java.util.Objects;

public enum ParkingSize {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int capacityRank;

    ParkingSize(int capacityRank) {
        this.capacityRank = capacityRank;
    }

    public boolean canFit(ParkingSize vehicleSize) {
        Objects.requireNonNull(vehicleSize, "vehicleSize must not be null");

        if (this == SMALL) {
            return vehicleSize == SMALL;
        }

        return vehicleSize.capacityRank <= this.capacityRank;
    }
}
