package lesson10_1023.fileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileReadingMain {

    public static final String PRODUCT_RECOURCE = "src/main/resources/products.txt";
    static final DecimalFormat round = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date currentDate = new Date();

        Product[] products = new Product[5];

        FileReader fileReader = new FileReader(PRODUCT_RECOURCE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine = bufferedReader.readLine();

        int i = 0;
        while (readLine != null) {

            String[] splitData = readLine.split(",");

            String name = splitData[0];
            String manufacturer = splitData[1];
            Double price = Double.valueOf(splitData[2]);

            Product product = new Product(name, manufacturer, price);

            products[i++] = product;
            readLine = bufferedReader.readLine();
        }
        double sum = 0;
        for (Product product : products) {
            System.out.println(product);
            sum += product.price;

        }
        System.out.print("Bendra suma " + round.format(sum) + "  € ");
        System.out.println();

        System.out.println(dateFormat.format(currentDate));

    }
}