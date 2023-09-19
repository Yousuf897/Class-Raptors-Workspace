package tek.week_4.day_1;

import java.util.Scanner;

public class IfStatementActivityThree {

    // Ask the user for their first and last name
    // if the first name is equal to last name -> Print True
    // else -> print false!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, lastName;

        System.out.print("Enter your first name: ");
        firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        lastName = input.nextLine();

        if (firstName.equals(lastName)) {
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }

    }
}
