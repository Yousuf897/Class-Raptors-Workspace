package tek.week_6.day_1;

import java.util.Scanner;

public class BreakActivity {

    // Print the multiplication table from 1 to 10 for the number 5
    // for example

    /*
    *  1 * 5 = 5
    *  2 * 5 = 10
    *  3 * 5 = 15
    *  4 * 5 = 20
    * ...
    *
    * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, start, end;

        System.out.println("Please enter the number in which you want to get the multiplication table for:");
        number = input.nextInt();

        System.out.println("Enter the start range for the multiplication table: ");
        start = input.nextInt();

        System.out.println("Enter the end range for the multiplication table: ");
        end = input.nextInt();

        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * *");
        for ( int i = start; i <= end; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }

/*        int number = 5;

        for ( int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }*/

    }
}
