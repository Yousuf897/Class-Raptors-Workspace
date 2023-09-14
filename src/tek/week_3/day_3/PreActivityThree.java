package tek.week_3.day_3;

public class PreActivityThree {

/*    Question 3: Parentheses Impact

    Take the expression: 4 + (3 * 2).
    How does the presence of parentheses affect the order of operations?
    Evaluate the expression inside the parentheses.
    Now, perform the addition. What is the result?

    */

    public static void main(String[] args) {

        System.out.println(4 + (3 * 2));
        System.out.println( 4 + (3 * 2) * (5 * 2) + (2 + 3) - 3 + 5  * 0);
        System.out.println( (4 + (3 * 2) * (5 * 2) + (2 + 3) - 3 + 5 ) * 0);
    }
}
