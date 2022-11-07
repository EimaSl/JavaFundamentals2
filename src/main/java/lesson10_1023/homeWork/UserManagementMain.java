package lesson10_1023.homeWork;

import java.io.IOException;
import java.util.Scanner;

public class UserManagementMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        ReadingFromFileToArrayList readingFromFileToArrayList = new ReadingFromFileToArrayList();
        User[] users = readingFromFileToArrayList.userFromFile();
        main(users, scanner);
    }

    private static void main(User[] users, Scanner scanner) throws IOException {
        menu();
        int selectedOption = scanner.nextInt();
        selectionMenu(users, selectedOption);
    }

    private static void menu() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tPlease select option from 1-6:");
        System.out.println("\t\t\t\t1. All users                        2. Users over 21 year old");
        System.out.println("\t\t\t\t3. Users names start with A/B       4. Users below 22 year old");
        System.out.println("\t\t\t\t5. Users females                    6. Females save to file");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    private static void selectionMenu(User[] users, int selectedOption) throws IOException {
        if (selectedOption == 1) {
            allUsers(users);
            main(users, scanner);
        }
        if (selectedOption == 2) {
            over21(users);
            main(users, scanner);
        }
        if (selectedOption == 3) {
            namesStartAorB(users);
            main(users, scanner);
        }
        if (selectedOption == 4) {
            below21(users);
            main(users, scanner);
        }
        if (selectedOption == 5) {
            listOfFemales(users);
            main(users, scanner);
        }
        if (selectedOption == 6) {
            CreateFile.createTxtFile(users);
            CreateFile.createXlsFile(users);


        } else {
            System.out.println("Please select option from 1-6");
            main(users, scanner);
        }
    }

    private static void allUsers(User[] users) {
        int num = 0;
        System.out.println("\t\t\tALL USERS LIST");
        for (User user : users) {
            num++;
            System.out.println(num + ": " + user);
        }
    }

    private static void over21(User[] users) {
        System.out.println("\t\t\tUSERS OVER 21");
        for (User user : users) {
            if (user.age > 21)
                System.out.println("User age: " + user.age + "\t\t\t Name: " + user.name);
        }
    }

    private static void below21(User[] users) {
        System.out.println("\t\t\tUSERS BELOW 22");
        for (User user : users) {
            if (user.age <= 21)
                System.out.println("User age: " + user.age + "\t\t\t Name: " + user.name);
        }
    }

    private static void namesStartAorB(User[] users) {
        System.out.println("\t\t\tUSERS names starts A/B");
        for (User user : users) {
            if (user.name.startsWith("A")) {
                System.out.println("phone number: " + user.phoneNumber + "\t\t\t Name: " + user.name);
            }
            if (user.name.startsWith("B")) {
                System.out.println("phone number: " + user.phoneNumber + "\t\t\tName: " + user.name);
            }
        }
    }

    private static void listOfFemales(User[] users) throws IOException {
        System.out.println("\t\t\tFEMALES USERS ");
        for (User user : users) {
            if (user.sex.equals("Female"))
                System.out.println("User sex: " + user.sex + "\t\t\t User: " + user.name);
        }
    }
}
