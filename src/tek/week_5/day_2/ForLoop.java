package tek.week_5.day_2;

public class ForLoop {
    /*
    *   Real-Life Analogy:

    Imagine you have a routine of doing 10 jumping jacks every morning. Each repetition is similar,
*   but you keep count to ensure you complete all 10.


    Programming Explanation:

       In programming, when you want to repeat a certain action or set of actions multiple times,
    *  you use loops. The For Loop is a common type of loop in Java.

    A basic for loop consists of three main parts:

     1: Initialization: This is where you set a starting point. Using the analogy,
     this would be starting at the first jumping jack.

    2: Condition: This is a test to see whether the loop should continue.
     In our analogy, it's like checking if you've done fewer than 10 jumping jacks.

    3: Iteration: After each loop, something needs to change to eventually end the loop.
     In our analogy, after each jumping jack, you'd increment your count.
    *
    *
    * */

    public static void main(String[] args) {
        // print from 1 to 10
        for (int number = 1; number <= 10; number++ ) {
            System.out.print( number + " ");
        }
        System.out.println();
        // How to print the values from 10 to 1
        for ( int number = 10; number >= 1; number-- ) {
            System.out.print(number + " ");
        }
    }
}
