package tek.week_5.day_1;

public class TwoDiArrayActivityOne {

    // Create a 2D Array of boolean
    // Store a bunch of trues and false in the 2D array of boolean
    // and execute the values from the rows and columns in which you have for your 2D array.

    public static void main(String[] args) {
//        boolean[][] booleanValues = new boolean[1][3];
//
//        booleanValues[0][0] = false;
//        booleanValues[0][1] = true;
//        booleanValues[0][2] = true;

        boolean[][] booleanValues = {
                { false, true, true}
        };

        System.out.println(booleanValues[0][0]);
        System.out.println(booleanValues[0][1]);
        System.out.println(booleanValues[0][2]);

        System.out.println(booleanValues.length);

    }
}
