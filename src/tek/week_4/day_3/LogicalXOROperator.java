package tek.week_4.day_3;

public class LogicalXOROperator {

    // XOR ( ^ ): Exactly one side of your condition needs to be true -> True else -> False

    public static void main(String[] args) {
        String firstName, lastName, middleName;

        firstName = "Taylor";
        lastName = "Bob";
        middleName = "Taylor";

        // if firstName equal to lastName AND firstName == middleName -> Print true else -> print false
        if (firstName.equals(lastName) && (firstName.equals(middleName))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (firstName.equals(lastName) || (firstName.equals(middleName))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (firstName.equals(lastName) ^ (firstName.equals(middleName))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
