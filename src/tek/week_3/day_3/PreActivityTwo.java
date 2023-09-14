package tek.week_3.day_3;

public class PreActivityTwo {

 /*   Question 2: Combined Operations

    Consider the expression: 10 / 2 - 3 + 4 * 2.
    List the operations in the order they would be performed according to Java's precedence rules.
    Evaluate the expression step by step based on the precedence order.
    What is the final value of the expression?


    */

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        num1 = 20;
        num2 = 2;
        num3 = 3;
        num4 = 6;
        num5 = 4;
        System.out.println( num1 / num2 - num3 + num4 * num5);
        System.out.println("The result of " + num1 + " / " + num2 + " - " + num3 + " + " + num4 + " * " + num5 + " is = " + (num1 / num2 - num3 + num4 * num5) );
        System.out.println("The result of 10 / 2 - 3 + 4 * 2 is = " + (num1 / num2 - num3 + num4 * num5));
    }
}
