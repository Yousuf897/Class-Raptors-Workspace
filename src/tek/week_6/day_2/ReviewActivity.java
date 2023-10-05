package tek.week_6.day_2;

public class ReviewActivity {

    // Write a java program that prints the even numbers from 1 to 20.

    public static void main(String[] args) {

        // First Step -> Printing the even numbers from 1 to 20. -> Skip odd numbers!

        // Second Step -> Print the odd numbers from 1 to 20 -> Skip even numbers!

/*        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
//                System.out.print(number + " ");
            } else {
                System.out.print(number + " ");
            }
        }*/

        // Printing the even numbers by skipping the odd numbers!

        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
               System.out.print(number + " ");
            } else {
               continue;
            }
        }

        // Second Step -> Print the odd numbers from 1 to 20 -> Skip even numbers!

        for (int number = 1; number <= 20; number++) {
            if ((number & 2) != 0) {
                System.out.print(number + " ");
            } else {
                continue;
            }
        }
    }

}
