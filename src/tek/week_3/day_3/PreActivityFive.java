package tek.week_3.day_3;

public class PreActivityFive {
/*    Question 5: Mixed Operators

    Start with the expression: 5 % 3 + 6 / 2 - 4.
    List the operations in the order they would be performed based on Java's precedence rules.
    Evaluate the expression step by step following the precedence order.
    What is the final value of the expression?
    */
public static void main(String[] args) {

    System.out.println( 5 % 3 + 6 / 2 - 4 );
    int x = 3;
    int y = ++x * 5 / x-- + --x;
    System.out.println(y);
    System.out.println( 5 % 3 * 2);
}
}
