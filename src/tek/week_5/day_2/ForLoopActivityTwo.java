package tek.week_5.day_2;

public class ForLoopActivityTwo {

    /*
    *
    * Activity 2: Count Down

    Using a for loop, write a program that counts down from 5 to 1.
    For each number, print "Countdown: " followed by the number.
    Think about how the initialization, condition, and iteration differ from the previous activity.
    *
    *  */

    public static void main(String[] args) {
        for ( int i = 5; i >= 1; i-- ) {
            System.out.println("Countdown: " + i);
        }
    }
}
