package lesson9_1022.warmUp;

import java.util.stream.IntStream;

public class LabaDienaMain {
    //iteracija till 100
    //if 3 - Laba
    //if 7 - diena
    //if Laba diena - Laba diena
    //other - number

    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0 && i % 6 == 0) {
//                System.out.println(i + "- Laba diena");
//            } else if (i % 6 == 0) {
//                System.out.println(i + "- diena");
//            } else if (i % 3 == 0) {
//                System.out.println(i + "- Laba ");
//            } else {
//                System.out.println(i + "- **********");
//            }
//        }
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
