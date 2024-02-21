package tek.review.day_1;

public class TwoDArray {

    public static void main(String[] args) {
        String[][] studentNames = {
                {"Alex", "Erin"}, // row - 0, col - 2
                {"Eric", "Trevor", "Brent"}, // row - 1, col - 3
                {"John", "Tony", "Murtaza", "Gulzai"} // row - 2, col - 4
        };

        for (int row = 0; row < studentNames.length; row++ ) {
            for (int col = 0; col < studentNames[row].length; col++ ) {
                System.out.print( studentNames[row][col] + " ");
            }
            System.out.println();
        }

    }
}


