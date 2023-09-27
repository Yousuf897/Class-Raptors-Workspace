package tek.week_5.day_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoopActivityFour {
    /*
    *   Activity 4: Even Numbers

    Create a program that prints all even numbers between 1 and 10 using a for loop.
    Consider how you can determine if a number is even. (Hint: Use the modulus operator %). ( number % 2 == 0 )
    Print each even number with a message like "Even number: " followed by the number.
    *
    * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int start, end, countEven;
        countEven = 0;

        System.out.print("Enter the start range: ");
        start = input.nextInt();
        System.out.print("Enter the end range: ");
        end = input.nextInt();


        for (int number = start; number <= end; number++) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
                countEven++;
            }
        }

        System.out.println("We have found " + countEven + " even numbers!");
        System.out.println("We have found " + countEven + " even number(s) within range " + start + " and " + end );
    }
}
