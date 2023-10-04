package tek.week_6.day_1;

import java.util.Scanner;

public class doWhileLoopActivityOne {

    // Print the numbers from 1 to 20 using do-while loop.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

/*        // you need your start point first!
        int number = 1;

        // Print the numbers
        do {
            System.out.print(number + " ");
            number++;
        } while ( number <= 20 );

        // Check for the condition -> if true -> print the number again -> if not -> STOP execution.*/

        int start, end;

        System.out.print("Enter the start range of the number: ");
        start = input.nextInt();

        System.out.print("Enter the end range of the number: ");
        end = input.nextInt();

        do {
            System.out.print(start + " ");
            start++;
        } while ( start <= end );
    }
}
