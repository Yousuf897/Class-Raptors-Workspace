package tek.week_3.day_2;

public class BreakActivity {

/*  Instructions:
    1. Declare a variable with an initial value.
    2. Use the postfix increment operator on the variable and print its value.
    3. Use the prefix increment operator on the same variable and print its value.
    4. Repeat the process with decrement operators.
    5. print the message along with prefix and postfix usage.
*/
    public static void main(String[] args) {

        int floor = 5;
        System.out.println("Going to move to next floor: (Post-Increment) " + floor++);
        System.out.println("Moved to floor: #" + floor);

        System.out.println("Going to next floor"  + ++floor);
        System.out.println("I am at floor: #" + floor);
    }

}
