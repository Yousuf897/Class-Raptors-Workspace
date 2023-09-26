package tek.week_5.day_1;

public class Array {
    /*
    *   Real-life Example:

        Imagine you have a bookshelf in your room. This bookshelf has a specific number
    *   of slots where you can place books. Each slot holds exactly one book.
    *   If you want to refer to a book, you know its position on the shelf,
*      like the third book from the left or the fifth book from the right. An array works similarly.
*
*         Programming Explanation:

        In programming, an array is a data structure that can hold more than one value at a time.
    * It is a collection of variables that are accessed with an index number.
    * All items in an array are of the same data type and each has a unique index, starting from 0
    *   (similar to the slot number in our bookshelf example).
    *
    *     Java Implementation:

         There are mainly two ways to initialize an array:

 1. Dynamic Initialization: In this method, you specify the size of the array first,
 * and then you can set values using the index.

        int[] numbers = new int[5]; // Declare an array of size 5

        numbers[0] = 10;  // The first element
        numbers[1] = 20;  // The second element
        // ... and so on.
*
*     2. Static Initialization: Here, you specify the size of the array and initialize it
*           with values at the same time.


            int[] numbers = {10, 20, 30, 40, 50};
*
       *
    *
    *
    * */

    public static void main(String[] args) {
        int[] numbers = new int[4];

        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[0] = 30;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

        System.out.println("THe length of my array is: " + numbers.length);

        int[] staticNumbers = { 50, 20, 30, 40 };

        System.out.println(staticNumbers[2]);
        System.out.println(staticNumbers[1]);
        System.out.println(staticNumbers[3]);

    }
}
