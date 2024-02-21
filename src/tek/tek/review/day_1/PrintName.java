package tek.review.day_1;

public class PrintName {

    public static void main(String[] args) {

        /*
        *
        * for ( initialization, condition, increment || decrement ) {
        *   // Block
        * }
        *
        * */

        // for loop
        for (int start = 1; start <= 10; start++) {
            System.out.println( start +  ": Alex");
        }

        // foreach loop
        String[] studentNames = { "Alex", "Tony", "Morgan", "Alexander", "John"};
        for ( String studentName :  studentNames ) {
            System.out.println( studentName );
        }

        // while
        /*
           initialization
        * while ( condition ) {
                increment || decrement
            }
        *
        * */

        // while loop  --> print the numbers from 50 to 55
        int number = 50;
        while ( number <= 55 ) {
            System.out.println(number);
            number++;
        }

        // do-while loop

        int startNumber = 60;
        do {
            System.out.print( startNumber + " ");
            startNumber++;
        } while ( startNumber <= 55 );

    }

}
