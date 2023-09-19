package tek.week_4.day_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifStatementActivityTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;

//        System.out.println("Please enter your score: ");
//        score = input.nextInt();

        score = 80;

        // if score: 90 - 100 -> Grade = A
        if (score >= 90) {
            System.out.println("You are at A grade!");
        } // else if score: 80 - 89 -> Grade = B
        else if ( score >= 80 ) {
            System.out.println("You are at B grade!");
        }  // else: -> Failed
         else {
            System.out.println("You are failed!");
        }

        // if score >= 70 -> C Grade!
        // if score >= 60 -> D Grade!
        // if score >= 50 -> E Grade!
        // else -> You are failed!

    }
}
