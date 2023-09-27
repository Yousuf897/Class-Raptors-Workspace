package tek.week_5.day_2;

public class ForLoopActivityThree {

        /*
        *   Activity 3: Print Array Elements

        You are given an array of integers: int[] numbers = {3, 7, 2, 8, 5};.
        Write a program using a for loop that prints the elements in the array.
        Keep a running total and add each array element to this total during each iteration of the loop.
    *
    *
        * */

    public static void main(String[] args) {
        int total = 0;
        int[] numbers = {3, 7, 2, 8, 5};

        for (int index = 0; index <= numbers.length - 1; index++) {
            System.out.println(numbers[index]);
            System.out.println("TOTAL: " + (total += numbers[index]));
        }

        System.out.println("Total: " + total);
    }
}
