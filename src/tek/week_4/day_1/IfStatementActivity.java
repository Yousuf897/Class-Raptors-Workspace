package tek.week_4.day_1;

import java.util.Scanner;

public class IfStatementActivity {

    // Declare two variables of data type integer
    // Initialize them to a value
    // compare if the first value is less than second value
    // if yes -> print the second value is larger than first value
    // else -> print the first value is larger than second value

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo;

        System.out.print("Enter the first number: ");
        numberOne = input.nextInt();

        System.out.print("Enter the second number: ");
        numberTwo = input.nextInt();

        if ( numberOne < numberTwo) {
            System.out.println( numberTwo + " is larger than " + numberOne);
        } else {
            System.out.println( numberTwo + " is less than " + numberOne);
        }


    }
}
