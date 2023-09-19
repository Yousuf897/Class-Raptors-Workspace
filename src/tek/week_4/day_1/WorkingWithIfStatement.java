package tek.week_4.day_1;

public class WorkingWithIfStatement {
    /*
    *      Real-life analogy:
         Imagine you're about to leave your house. Before you step out,
    *    you peek through the window. If it's raining, you decide to take an umbrella with you.

    *   Java-related explanation:
    *
        The "if" control statement in Java allows you to make a decision based on a condition.
*       If the condition is true, then the code inside the "if" block gets executed.
*
*       if (isRaining) {
            takeUmbrella();
           }
*
*       You can also have an extended version with "else" to handle other situations. For instance,
*       if it's not raining, you might want to wear sunglasses.
*
*   if (isRaining) {
    takeUmbrella();
   } else {
    wearSunglasses();
*   }

 *
    * */

    public static void main(String[] args) {
        boolean isRaining = false;

        System.out.println("I am about to go out");

        if (isRaining) {
            System.out.println("I am outside with umbrella!");
        } else {
            System.out.println("I am outside with my sunglasses!");
        }

        System.out.println("Simple Message");
    }

}
