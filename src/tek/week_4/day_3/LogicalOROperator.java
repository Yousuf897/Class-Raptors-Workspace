package tek.week_4.day_3;

public class LogicalOROperator {
    public static void main(String[] args) {
        /*    || (Logical OR): At least one condition must be true for the entire expression to be true.*/

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

    }
}
