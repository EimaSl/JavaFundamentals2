package lesson10_1023.recap;

public class WorkshopMain {

    public static void main(String[] args) {

        Mechanikas mechanikas = new Mechanikas("Tomas", 5, "AutoWS", 3500);

        System.out.println(mechanikas);

        lineBreak();
        mechanikas.breakTime();

        lineBreak();
        Cigarete cigareteAtMechanic = mechanikas.giveCigarete();

        lineBreak();
        System.out.println("Mechanikas has " + cigareteAtMechanic.brand + " , but decided not to smoke");
        System.out.println("\t!!! HEALTH and SAFETY IS FIRST !!!");

        lineBreak();
        Car volvo = new Car("VOLVO XC60", true);
        mechanikas.carRepair(volvo);
        mechanikas.carRepair(volvo);
        lineBreak();

        Car bmw = new Car("BMW X5", true);
        Car skoda = new Car("Skoda Fabia", false);
        Car nissan_skyline_gt = new Car("Nissan Skyline GT", true);

        Car[] customerAuto = {bmw, skoda, nissan_skyline_gt};
//        System.out.println(customerAuto[2].brand);
        for (Car car : customerAuto) {
            mechanikas.carRepair(car);
        }
        lineBreak();


    }

    private static void lineBreak() {
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
