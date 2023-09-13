package tek.week_3.day_2;

public class IncrementAndDecrement {
    /*
    *   Increment means that you're going to increase the value (1) Increase by 1.
    *   Decrement means that you're going to decrease the value (1) -> Decrease by 1.
    *
    *   Think of an elevator in a building. People can either go up one floor or
    *  down one floor at a time using the elevator's buttons. If they press the "up" button,
    *  the elevator ascends by one floor (increment). If they press the "down" button, it descends
    * by one floor (decrement). This single-floor movement is analogous to incrementing or decrementing
    * in programming.


    In Java, you can increase or decrease a variable's value by one using special operators. These are:

    ++ : Increment operator. It increases the variable's value by one.
    -- : Decrement operator. It decreases the variable's value by one.

    These operators can be used in two positions, prefix (++x or --x) and postfix (x++ or x--), and their placement can affect the order of operations in expressions.
  *
  * */

    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
        number += 1;
        System.out.println(number);
        System.out.println(number + 1);
        number++; // postfix increment
        System.out.println(number);
        number--; // postfix decrement
        System.out.println(number);






        int x = 55;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);


        int numberOne = 45;
        System.out.println(++numberOne);
        System.out.println(--numberOne);

        System.out.println(numberOne++);
        System.out.println(numberOne--);
        System.out.println(numberOne);

        // Post-Increment: Print the value of variable first and then increment.
        // Pre-Increment:  Increment the value of variable first and then print it.

        // Post-Decrement: Print the value of variable first and then decrement.
        // Pre-Decrement:  Decrement the value of variable first and then print it.


    }
}
