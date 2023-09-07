package tek.week_2.day_2;

public class WorkingWithStringMethods {

    public static void main(String[] args) {
        int numberOne, numberTwo;
        String firstName, lastName, middleName;

        numberOne = 10;
        numberTwo = 10;

        firstName = "Bob";
        lastName = "bob";
        middleName = "Bob";

        System.out.println(numberOne == numberTwo);

        System.out.println(firstName.equals(lastName));

        System.out.println(firstName.hashCode());
        System.out.println(lastName.hashCode());
        System.out.println(middleName.hashCode());

        System.err.println("Bob".equals(lastName));
    }
}
