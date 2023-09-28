package tek.week_5.day_3;

public class WhileLoop {

/*    Real-Life Analogy:

    Imagine you have a jar of cookies. Every time you feel like having a snack,
     you take one cookie out of the jar. You continue to do this as long as there are cookies in the jar.
     The act of checking if there are cookies in the jar and then taking one is similar to how a while
     loop operates.

    Programming Explanation:

    In programming, the while loop repeatedly executes a block of statements
    as long as a specified condition evaluates to true. When the condition becomes false, the loop
    exits, and the program continues with the next statement after the loop.

            Here's the basic structure:


            while (condition) {
            // body of the loop
            }

        */

    public static void main(String[] args) {
        String[] names = {"Tek", "School", "Welcome", "To"};
        int index = 0;

//        while ( index < names.length ) {
//            System.out.println( "The value at index " + index  + " is: " + names[index] );
//            index++;
//        }

        while ( index < names.length) {
            System.out.println("index[" + index + "] = " + names[index]);
            index++;
        }

        // index[X] = VALUE AT THAT SPECIFIC INDEX
    }

}
