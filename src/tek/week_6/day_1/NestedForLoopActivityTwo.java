package tek.week_6.day_1;

public class NestedForLoopActivityTwo {

/*
    Activity 2: Multiplication Table

	1:	Use nested for loops to print a multiplication table up to 10x10.
	The outer loop will iterate for numbers 1 through 10, and the inner loop will iterate for numbers 1 through 10 for each
	iteration of the outer loop.

	1 * 1 = 1
	2 * 2 = 2;
	.   .
	.   .
	.

*/



    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println( i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
