package tek.week_6.day_1;

public class NestedForLoopActivityOne {

    // print the combination of the numbers from 1 all the way to 6.

    public static void main(String[] args) {

        // print the combination of the numbers from 1 all the way to 6.

        for (int outer = 1; outer <= 6; outer++) {
            for (int inner = 1; inner <= 6; inner++) {
                System.out.println(outer + " " + inner);
            }
        }

        // Print the combination of three numbers starting from 1 all the way to 6.

        for (int outer = 1; outer <= 6; outer++) {
            for (int inner = 1; inner <= 6; inner++) {
                for (int number = 1; number <= 6; number++) {
                    System.out.println(outer + " " + inner + " " + number);
                }
            }
        }


    }

}
