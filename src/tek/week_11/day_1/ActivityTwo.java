package tek.week_11.day_1;

import java.util.ArrayList;
import java.util.Collections;

public class ActivityTwo {

    /*    Activity 2: Sorting a Book Collection
    Objective:

    Manage a collection of book titles using an ArrayList, perform sort operations, and find the total number of books in the collection.
    Steps:

    Create an ArrayList of String to store book titles named bookCollection.
    Add at least seven book titles to the bookCollection.
    Use Collections.sort() to sort the bookCollection alphabetically.
    Display the sorted bookCollection.
    Find and print the number of books in the bookCollection.*/

    public static void main(String[] args) {

        ArrayList<String> bookCollection = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // add seven values
        bookCollection.add("Z7");
        bookCollection.add("H6");
        bookCollection.add("J5");
        bookCollection.add("L9");
        bookCollection.add("B2");
        bookCollection.add("A1");
        bookCollection.add("E0");

        // print the original version
        System.out.println( bookCollection );

        // sort the list
        Collections.sort(bookCollection);

        // after sorting the list
        System.out.println( bookCollection );

        /*
          [Z7, H6, J5, L9, B2, A1, E0]
          [A1, B2, E0, H6, J5, L9, Z7]

          */

        for (int i = 10; i >= 1; i--) {
            numbers.add(i);
        }

        System.out.println( numbers );

        // Sort the numbers
        Collections.sort(numbers);

        // print the sorted version
        System.out.println( numbers );

/*        [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
          [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
*/


    }
}
