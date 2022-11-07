package lesson9_1022.strings;

import java.util.Arrays;
import java.util.Comparator;

public class TeamWork {

    public static void main(String[] args) {

        String[] countries = getCountries();

        task1(countries);
        task2(countries);
        task3(countries);
        task4(countries);
        task5(countries);
        task6(countries);

        //7  Surusiuoti salis masyve pagal pavadinimu ilgius nuo trumpiausio iki ilgiausio.
        System.out.println("\nExtra: Surusiuoti salis masyve pagal pavadinimu ilgius nuo trumpiausio iki ilgiausio.");
        System.out.println("Sorting countries on the basis of their lengths (shortest to longest) = ");

        System.out.println("\n--------------------");
        for (int i = 0; i < countries.length; i++) {
            for (int j = i + 1; j < countries.length; j++) {
                String tempi = countries[i];
                if (countries[i].length() > countries[j].length()) {
                    countries[i] = countries[j];
                    countries[j] = tempi;
                }
            }
        }
        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println("\n--------------------");

        System.out.println(" Arrays.sort method");
        String[] arrSorted = Arrays.stream(countries)
                .sorted(Comparator.comparing(String::length))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(arrSorted));

        System.out.println("\n--------------------");
        System.out.println("Comparator method");
        Arrays.sort(countries, Comparator.comparingInt(String::length));
        Arrays.asList(countries).forEach(System.out::print);
    }

    private static void task6(String[] countries) {
        //6 Suskaiciuoti ir grazinti bendra raidziu skaiciu visame masyve, kuri sudaro salys.
        System.out.println("\n\n6.Task: Suskaiciuoti ir grazinti bendra raidziu skaiciu visame masyve, kuri sudaro salys.");
        int allLettersInArray = 0;
        for (String country : countries) {
            int countryLength = country.length();
            allLettersInArray += countryLength;
        }
        System.out.println(allLettersInArray);
    }

    private static void task5(String[] countries) {
        // 5 Isspausdinti saliu pavadinimus nukrepant ju pirmasis raides. Pvz ietuva, atvija, uomija.
        System.out.println("\n\n5.Task: Isspausdinti saliu pavadinimus nukrepant ju pirmasis raides. Pvz ietuva, atvija, uomija.");
        for (String country : countries) {
            System.out.print(country.substring(1) + " ");

        }
    }

    private static void task4(String[] countries) {
        // 4 Isspausdinti saliu pavadinimus, kurie ilgesni nei 5 raides.
        for (String country : countries) {
            if (country.length() > 7) {
                System.out.print(country + " ");
            }
        }
    }

    private static void task3(String[] countries) {
        // 3 Isspausdinti saliu pavadinimus, kurios baigiasi galune "JA"
        for (String country : countries) {
            if (country.endsWith("ia")) {
                System.out.print(country + " ");
            }
        }
        System.out.println("\n\n4.Task: Isspausdinti saliu pavadinimus, kurie ilgesni nei 5 raides.");
    }

    private static void task2(String[] countries) {
        // 2
        System.out.println("\n\n2.Task: Ispausdinti saliu pavadinimus, kurios prasideda raide \"T\".");
        for (String country : countries) {
            if (country.startsWith("T")) {
                System.out.print(country + " ");
            }
        }
        System.out.println("\n\n3.Task: Isspausdinti saliu pavadinimus, kurios baigiasi galune \"JA\"");
    }

    private static void task1(String[] countries) {
        //1
        System.out.print("1. Task: Countries in mine array: \n" + Arrays.toString(countries));
    }

    private static String[] getCountries() {
        String[] countries = {"Estonia", "Latvia", "Lithuania", "Poland", "Germany",
                "France", "Czech", "Hungary", "Slovenia", "Croatia", "Tunis"};
        return countries;
    }

}
