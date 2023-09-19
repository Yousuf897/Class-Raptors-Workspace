package tek.week_4.day_1;

import java.util.Scanner;

public class ReviewActivityTwo {
    /*
     *  Working with Scanner
     *   1. Create the object of Scanner class.
     *   2. Declare two integer variables of num1 and num2.
     *   3. Ask the user for their first and second number.
     *   4. get their input and store them in the variables in which declared before
     *   5. print the sum of num1 and num2 in the following format
     *
     *   ***** if first number is "100" and second number is "150"
     *
     *   EXPECTED OUTPUT: The result of 100 + 150 = 250
     *
     * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.println("The result of " + num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
