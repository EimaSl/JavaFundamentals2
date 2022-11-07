package lesson10_1023.homeWorkTeslaBatteries.row;

public class EssCell {

    int quantity;
    double operatingVoltage;
    int setOf25VPerPack;

    public EssCell(int quantity, double operatingVoltage, int setOf25VPerPack) {
        this.quantity = quantity;
        this.operatingVoltage = operatingVoltage;
        this.setOf25VPerPack = setOf25VPerPack;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getOperatingVoltage() {
        return operatingVoltage;
    }

    public void setOperatingVoltage(double operatingVoltage) {
        this.operatingVoltage = operatingVoltage;
    }

    public int getSetOf25VPerPack() {
        return setOf25VPerPack;
    }

    public void setSetOf25VPerPack(int setOf25VPerPack) {
        this.setOf25VPerPack = setOf25VPerPack;
    }
}
