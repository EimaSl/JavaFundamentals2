package lesson10_1023.parkingLot.service;

import java.util.List;

public class Location {

    public int levelNumber;
    public int rows;
    public List<ParkingSlot> takenSlots;
    public int SLOTS_PER_ROW = 2;


    public ParkingSlot findAvailableSpot() {

        int totalNumberSlots = rows * SLOTS_PER_ROW;
        if (takenSlots.size() >= totalNumberSlots) {
            //parking full
            return null;
        } else if (takenSlots.isEmpty()) {
            return new ParkingSlot(0, 0, levelNumber);
        } else {
            ParkingSlot lastSpaceOccupied = takenSlots.get(takenSlots.size() - 1);
            if (lastSpaceOccupied.col < SLOTS_PER_ROW) {
                return new ParkingSlot(lastSpaceOccupied.row, lastSpaceOccupied.col + 1, levelNumber);
            } else {
                return new ParkingSlot(lastSpaceOccupied.row + 1, 0, levelNumber);
            }
        }
    }

    public boolean park(Vehicle vehicle) {
        ParkingSlot freeSpace = findAvailableSpot();
        if (freeSpace == null) {
            return false;
        } else {
            freeSpace.park(vehicle);
            takenSlots.add(freeSpace);
            return true;
        }
    }
}
