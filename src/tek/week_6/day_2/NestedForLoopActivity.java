package tek.week_6.day_2;

public class NestedForLoopActivity {

/*
    Print the values of the following 2D array using the nested for loop!

    int[][] numbers = {
    { 1, 2, 3, 4, 5},
    { 6, 7, 8},
    { 9 , 10, 11, 12, 13, 14, 15},
    { 16, 17, 18, 19, 20}

     };

     */

    public static void main(String[] args) {

        int[][] numbers = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8},
                { 9 , 10, 11, 12, 13, 14, 15},
                { 16, 17, 18, 19, 20}

        };

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("At row [" + row + "] and col [" + col + "]  value is: " + numbers[row][col]);
            }
            System.out.println();
        }
    }

    // At row [row] and col [col] value is: VALUE

}
