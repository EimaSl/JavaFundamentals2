package lesson10_1023.recap;

public class Car {

    String brand;
    boolean isBroken;

    public Car(String brand, boolean isBroken) {
        this.brand = brand;
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", isBroken=" + isBroken +
                '}';
    }
}
