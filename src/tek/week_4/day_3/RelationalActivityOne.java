package tek.week_4.day_3;

public class RelationalActivityOne {
    /*
    *   Book Height Comparison

        You have two books with different heights: double book1Height = 9.5; and double book2Height = 7.0;.
        Compare the heights of the two books.
        Determine:
            Which book is taller.
            If any book is shorter or of the same height as the other.
        Print out the results of your comparisons.
    *
    * */

    public static void main(String[] args) {
        double book1Height = 10.0;
        double book2Height = 10.0;

        if (book1Height > book2Height) {
            System.out.println("Book 1 is the tallest!");
        } else if (book2Height <= book1Height) {
            System.out.println("Book 2 is either less than or equal to book 1");
        } else {
            System.out.println("Both of the books have the same height!");
        }

    }
}
