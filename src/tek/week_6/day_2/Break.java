package tek.week_6.day_2;

public class Break {

/*    break Statement:

    The break statement, when used inside a loop, immediately exits the loop, regardless of the loop's condition.

    Real-Life Analogy: Imagine you're searching for a book in a stack. Once you find the book you were looking for,
    you stop searching, even if you haven't gone through the entire stack. Stopping the search is similar to the break statement.

    Example: Search for the number 5 in an array and print a message when found. Stop the search once 5 is found.

    int[] numbers = {1, 3, 4, 5, 7, 8, 9, 10};

    for (int num : numbers) {
            if (num == 5) {
                System.out.println("Found the number 5!");
                break;  // Exit the loop immediately once 5 is found
            }
        }*/

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 5, 7, 8, 9, 10};

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] == 5 ) {
                System.out.println("We have found number: " + numbers[index]);
                break;
            }
            System.out.print(numbers[index] + " ");
        }

        for (int number : numbers) {

            if (number == 5 ) {
                System.out.println("We have found number: " + number);
                break;
            }
            System.out.print(number + " ");

        }

    }

}
