package lesson10_1023.parkingLot.service;

import java.util.List;

public class ParkingLot {

    public List<Location> locations;

    public ParkingLot(List<Location> locations) {
        this.locations = locations;
    }

    public boolean park(Vehicle vehicle){
        for (Location location : locations) {
            if(location.park(vehicle)){
                return true;
            }else{
                continue;
            }
        }
        return false;
    }
}
