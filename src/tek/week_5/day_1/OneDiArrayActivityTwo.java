package tek.week_5.day_1;

public class OneDiArrayActivityTwo {
    /*
    *
    * Bookshelf Organizer:
    *
    Objective: Store a collection of book titles and retrieve a book by its position on the shelf.
    Steps:

        Declare a 1D array to hold a certain number of book titles.
        Assign a book title to each position in the array.
        To find the title of the book that's 3rd from the left, access the element at index 2.
        Print the book title retrieved from the array.
*/

    public static void main(String[] args) {
        String[] bookTitles = {"Book1", "Book2", "Book3", "Book4", "Book5"};
        System.out.println("The third book from the left is: " + bookTitles[2]);
    }

}
