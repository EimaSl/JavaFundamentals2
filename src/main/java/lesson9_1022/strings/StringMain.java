package lesson9_1022.strings;

public class StringMain {
    public static void main(String[] args) {

        String myName = "Tom"; //
        String friendName = "Tom";
        String dadName = "Peter";

        System.out.println(myName == friendName); // == checks if thouse variables refer to same object
        System.out.println(myName == dadName);
        System.out.println("Values are equal? = " + myName.equalsIgnoreCase(friendName));
        System.out.println("Values are equal? = " + myName.equalsIgnoreCase(dadName));

        System.out.println();
        String s1 = "Labas";
        String s2 = "Labas";
        String s3 = new String("Labas");
        String s4 = "Viso";

        System.out.println(s1 == s2); // same Literal "Labas?
        System.out.println(s1 == s3);
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println();
        System.out.println("test" == "test"); // poole yra viena Test reiksme
        System.out.println("test".equals("test"));

        System.out.println();
        System.out.println("test" == "te" + "st");
    }
}
