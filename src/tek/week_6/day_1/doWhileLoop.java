package tek.week_6.day_1;

public class doWhileLoop {

/*
    Real-Life Analogy:

    Consider going on a roller coaster at an amusement park. No matter the queue, you always have
    to ride once after waiting in line. After the ride, you then decide whether you want to ride again. Essentially,
     you're guaranteed one ride (the initial action) and then determine if you want to continue (loop based on a condition).

    Programming Explanation:

    The do-while loop is similar to the while loop, but there's a key difference:
    The loop body in a do-while loop is executed at least once before the condition is tested because
    the condition is evaluated after the loop body. If the condition evaluates to true, the loop continues
    to execute, repeating the body. This continues until the condition evaluates to false.


    Sytanx of do-while loop

    do {
        // your body of loop
    } while ( condition );

*/

    public static void main(String[] args) {

            int i = 1;

/*           while ( i <= 5 ) {
               System.out.println("Hello!");
               i++;
           }*/

//        System.out.println("Hello! but from the outside of the loop block!");

           do {
               System.out.println(i);
               i++;
           } while ( i <= 5 );

    }
}
