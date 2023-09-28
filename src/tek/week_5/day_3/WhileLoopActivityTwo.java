package tek.week_5.day_3;

import java.util.Scanner;

public class WhileLoopActivityTwo {
    /*
    * Activity 2: Countdown Timer

    Prompt the user to enter a number to start the countdown from.
    Using a while loop, count down from this number to 1, displaying each number on its line.
    After reaching 1, display a message saying "Blast off!".
    *
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to start the countdown: ");
        int countDown = input.nextInt();

        while ( countDown >= 1 ) {
            System.out.println("Counting: " + countDown);
            countDown--;
        }

        System.out.println("Blast off!");
    }
}
