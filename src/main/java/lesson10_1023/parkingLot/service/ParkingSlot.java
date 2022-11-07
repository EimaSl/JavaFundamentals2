package lesson10_1023.parkingLot.service;

public class ParkingSlot {

    public  int row;
    public  int col;
    public  int level;
    public Vehicle vehicleOccupyingSlot;

    public ParkingSlot(int row, int col, int level) {
        this.row = row;
        this.col = col;
        this.level = level;
    }

    public void park(Vehicle vehicle){
        this.vehicleOccupyingSlot = vehicle;
    }

}
