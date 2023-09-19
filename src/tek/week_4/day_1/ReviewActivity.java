package tek.week_4.day_1;

import java.util.Scanner;

public class ReviewActivity {

    /*
    *  Working with Scanner
    *
    *   1. Create the object of Scanner class.
    *   2. Declare two String variables of first and last name.
    *   3. Ask the user for their first and last name.
    *   4. get their input and store them in the variables in which declared before
    *   5. print the first and last name in the following format
    *
    *   ***** if first name is "Bob" and last name is "Taylor"
    *
    *   EXPECTED OUTPUT: Your name is: Bob Taylor
    *
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, lastName;

        System.out.print("What is your first name: ");
        firstName = input.nextLine();

        System.out.print("What is your last name: ");
        lastName = input.nextLine();

        System.out.println("Your name is: " + firstName + " " + lastName);

    }

}
