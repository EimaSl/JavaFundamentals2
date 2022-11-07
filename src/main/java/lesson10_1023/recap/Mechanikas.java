package lesson10_1023.recap;

public class Mechanikas {

    String name;
    int experienceYears;
    String workshop;
    double salary;

    public Mechanikas() {
        System.out.println("Default constructor initiated");
    }

    public void breakTime(){
        System.out.print("\t----12:00 --------");
        System.out.println("Time to eat----");
    }

    public Cigarete giveCigarete(){
        System.out.println("!!! Don't smoke Malboro, it's unhealthy !!!");
        Cigarete malboro = new Cigarete("Malboro");
        return malboro;
    }

    public void carRepair(Car car){
        if (car.isBroken){
            System.out.println("REPAIR WORKSHOP: Car need to be repaired " + car.brand);
            car.isBroken = false;
        } else {
            System.out.println("REPAIR WORKSHOP: /// Car is not broken anymore, been repaired or problem is not found");
        }

    }

    public Mechanikas(String name, int experienceYears, String workshop, double salary) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.workshop = workshop;
        this.salary = salary;
    }

        @Override
    public String toString() {
        return "Technikas : Name | Exp | Workshop | Salary:\n\t\t\t" +
                 name + "|\t" + experienceYears + "\t|\t" + workshop + "\t|\t" + salary ;
    }
//    @Override
//    public String toString() {
//        return String.format("Mechanikas vardu %s, jis dirba servise %s, " +
//                "jo patirtis %d, jis uzdirba %f euru.", name, workshop, experienceYears, salary);
//    }
}
