package lesson10_1023.homeWorkTeslaBatteries;

import lesson10_1023.homeWorkTeslaBatteries.row.EssBattery;
import lesson10_1023.homeWorkTeslaBatteries.row.EssCell;
import lesson10_1023.homeWorkTeslaBatteries.row.EssModule;


public class CalculationService {

    public double oneCellCapacity(EssBattery batteries, EssCell essCell) {
        double capacityOfCell = batteries.getCapacity() * essCell.getOperatingVoltage() / 1000;
        return capacityOfCell;
    }

    public double oneCellPower(EssBattery batteries, EssCell essCell, EssModule essModule) {
        double capacityOfCell = batteries.getCapacity() * essCell.getOperatingVoltage() / 1000;
        double powerOfCell = capacityOfCell * essModule.getOpVoltage() / 1000;
        return powerOfCell;
    }

    public double numberOfBatteriesPerCell( EssCell essCell) {
        int setBatFor24V = 7;
        int batteriesPerCell = setBatFor24V * essCell.getSetOf25VPerPack();
        return batteriesPerCell;
    }

    public double numberOfBatteriesPerEssModule( EssCell essCell) {
        int setBatFor24V = 7;
        int batteriesPerEssModule = setBatFor24V * essCell.getSetOf25VPerPack()*essCell.getQuantity();
        return batteriesPerEssModule;
    }

}
