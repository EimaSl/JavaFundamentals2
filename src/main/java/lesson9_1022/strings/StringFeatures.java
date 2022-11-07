package lesson9_1022.strings;

public class StringFeatures {

    public static void main(String[] args) {

        String phrase = "Today is saturday!";
        char drivingCategory = 'B';

        char[] raides = phrase.toCharArray();
        System.out.println();
        System.out.println( raides);

//        char[] skaiciai = {1,2,3};
//        System.out.println(skaiciai);
//        System.out.println(Arrays.toString(raides));

        System.out.println();

        for (char raide : raides) {
            System.out.print( raide + "^");
        }

        System.out.println("\n\nPrint char //ToDay is saturday!// at symbol 2 == " + phrase.charAt(2));

        if(phrase.length() >10){
            System.out.println("\"" + phrase + "\" - " + "turi daugiau nei 10 simboliu");
        }
        else {
            System.out.println("eilute trumpa");
        }

        String daiktas = "Computer";
        System.out.println(daiktas.contains("Comp"));
        System.out.println(daiktas.contains("Bla"));
        System.out.println(daiktas.substring(0,5));

        System.out.println(new StringBuffer(phrase).reverse());
        System.out.println(new StringBuffer(phrase).delete(0,5));


    }

}
