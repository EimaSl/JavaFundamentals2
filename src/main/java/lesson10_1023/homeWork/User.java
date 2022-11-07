package lesson10_1023.homeWork;

public class User {

    String name;
    String surname;
    String email;
    int age;
    String sex;
    String phoneNumber;


    public User() {
    }

    public User(String name, String surname, String email, int age, String sex, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
