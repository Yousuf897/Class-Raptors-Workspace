package tek.week_5.day_2;

public class ForLoopActivityFive {

        /*
    *   Activity 5: Odd Numbers

    Create a program that prints all odd numbers between 1 and 10 using a for loop.
    Consider how you can determine if a number is even. (Hint: Use the modulus operator %). ( number % 2 != 0 )
    Print each odd number with a message like "odd number: " followed by the number.
    *
    * */

    public static void main(String[] args) {

        int countOdd = 0;
        int countEven = 0;

        System.out.println("* * * * * * * * * * Odd Numbers * * * * * * * * * * ");

        for (int number = 1; number <= 10; number++) {
            if (number % 2 != 0) {
                System.out.println("Odd number: " + number);
                countOdd++;
            } else {
                System.out.println("Even number: " + number);
                countEven++;
            }
        }

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * ");

        System.out.println("We have found " + countOdd + " even numbers!");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * ");

        System.out.println("We have found " + countEven + " even numbers!");
    }
}
