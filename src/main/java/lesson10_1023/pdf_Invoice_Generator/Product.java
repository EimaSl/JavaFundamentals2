package lesson10_1023.pdf_Invoice_Generator;

public class Product {
    private String name;
    private int quantity;
    private float pricePerPiece;

    public Product(String name, int quantity, float pricePerPiece) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerPiece = pricePerPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(float pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }
}
