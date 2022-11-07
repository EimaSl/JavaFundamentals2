package lesson10_1023.homeWorkTeslaBatteries.row;

public class EssBattery {

    String brand;
    String type;
    double capacity;
    int quantity;


    public EssBattery(String brand, String type, double capacity, int quantity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
