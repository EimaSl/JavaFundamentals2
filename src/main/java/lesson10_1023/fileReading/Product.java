package lesson10_1023.fileReading;

public class Product {
    String name;
    String manufacture;
    Double price;

    public Product(String name, String manufacture, Double price) {
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                '}';
    }
}
