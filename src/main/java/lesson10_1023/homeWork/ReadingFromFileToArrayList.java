package lesson10_1023.homeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileToArrayList {

    public static final String PRODUCT_RECOURSE = "src/main/resources/user.txt";

    User[] userFromFile() throws IOException {

        User[] users = new User[20];

        FileReader fileReader = new FileReader(PRODUCT_RECOURSE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine = bufferedReader.readLine();

        int i = 0;
        while (readLine != null) {

            String[] splitData = readLine.split(",");

            String name = splitData[0];
            String surname = splitData[1];
            String email = splitData[2];
            int age = Integer.parseInt(splitData[3]);
            String sex = splitData[4];
            String phoneNumber = splitData[5];

            User user = new User(name, surname, email, age, sex, phoneNumber);

            users[i++] = user;
            readLine = bufferedReader.readLine();
        }
        return users;
    }
}
