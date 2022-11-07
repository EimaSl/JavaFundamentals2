package lesson10_1023.homeWorkKinematiks;

public class Main {

    public static void main(String[] args) {

        KinematicsService kinematicsService = new KinematicsService();

        double distance = kinematicsService.distanceCalc(-135, 30);
        System.out.println(distance);

    }

}
