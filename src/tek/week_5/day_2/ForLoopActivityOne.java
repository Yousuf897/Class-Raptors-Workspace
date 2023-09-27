package tek.week_5.day_2;

public class ForLoopActivityOne {
    /*
    *   Activity 1: Count Up

    Write a program using a for loop that prints numbers from 1 to 5.
    For each number, it should print "Number: " followed by the number.
    Observe the loop control variable and how it changes with each iteration.
    *
    *
    * for (initialization; condition; iteration) {
        // body of the loop
        }

    *  */

    public static void main(String[] args) {
        for ( int i = 1; i <= 5; i++ ) {
            System.out.println("Number: " + i);
        }
    }
}
