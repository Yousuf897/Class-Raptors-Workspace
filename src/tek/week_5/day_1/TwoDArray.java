package tek.week_5.day_1;

public class TwoDArray {
    /*
    * Real-life Example:

        Imagine a chessboard. A standard chessboard has 8 rows and 8 columns, making 64 squares in total.
        * Each square can be identified with a unique combination of its row and column.
        * For instance, the top-left corner could be (1,1), while the bottom-right is (8,8).
        * Now, think of placing chess pieces on this board. You'd say, "Place the king on square (1,5)" or
        * "Move the pawn to square (2,2)".
        * In this analogy, the chessboard is a 2D array, and the row and column combination can
        * be related to the indices of the array.
        * The chess pieces represent the data we're storing.

        * Programming Explanation:

        A 2D array in programming can be thought of as an "array of arrays".
        * It's essentially a matrix where you use two indices to store or retrieve an item: one indicating the
        * row and the other indicating the column.

    * */

    public static void main(String[] args) {
        // Using Dynamic Initialization
        int[][] numbers = new int[3][2];
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[1][0] = 30;
        numbers[1][1]= 40;
        numbers[2][0] = 50;
        numbers[2][1] = 60;

        System.out.println(numbers[2][1]);

        String[][] names = { {"Jhon", "Alex", "Bob"}, {"Din", "Rock", "Robin"} };
    }
}
