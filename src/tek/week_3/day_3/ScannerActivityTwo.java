package tek.week_3.day_3;

import java.util.Scanner;

public class ScannerActivityTwo {

    // Ask the user for two int values separately. (Using the Scanner)
    // get the both values
    // add the values together
    // print the result

    public static void main(String[] args) {

        int numberOne, numberTwo, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        numberOne = input.nextInt();
        System.out.print("Enter the second value: ");
        numberTwo = input.nextInt();

        result = numberOne + numberTwo;

        System.out.println(numberOne + numberTwo);
        System.out.println(result);
        System.out.println("The result of " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        System.out.println("The result of " + numberOne + " + " + numberTwo + " = " + result);
    }
}
