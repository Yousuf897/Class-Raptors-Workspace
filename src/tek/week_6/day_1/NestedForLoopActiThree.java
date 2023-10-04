package tek.week_6.day_1;

public class NestedForLoopActiThree {
    /*

    *
    * *
    * * *
    * * * *
    * * * * *

     */

    public static void main(String[] args) {

        // Outer loop
        for ( int i = 1; i <= 10; i++) {
            // Inner loop
            for ( int j = 1; j <= i; j++) {

                System.out.print(" * ");

            }

            System.out.println();

        }

    }

}

