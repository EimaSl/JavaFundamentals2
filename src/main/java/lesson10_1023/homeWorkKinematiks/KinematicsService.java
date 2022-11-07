package lesson10_1023.homeWorkKinematiks;

public class KinematicsService {



    public double distanceCalc(double greitis, double laikas) {
        double s = 0;
        if (greitis >= 0 && greitis <= 100 && laikas >= 0 && laikas <= 60) {
            s = greitis * laikas;
        }
        else if (greitis > 100) {
            System.out.println("Greitis negali buti daugiau 100");
        }
        else if(greitis < 0 ){
            System.out.println("Greitis negali buti maziau 0");
        }

        else {
            System.out.println("Laikas negali buti maziau 0 arba daugiau 60");
        }
        return s;
    }


}
