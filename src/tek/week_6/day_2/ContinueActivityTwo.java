package tek.week_6.day_2;

import java.util.Scanner;

public class ContinueActivityTwo {

    // Prompt the user to enter a range of number in which they want to print!
    // start and the end range.
    // Then ask the user which number they do not want to see in that specific range!

    // Print the numbers within the same range and do not print the number in which the user asked for!

    public static void main(String[] args) {

        int start, end, skipNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start range of number: ");
        start = input.nextInt();


        System.out.print("Enter the end range of number: ");
        end = input.nextInt();

        System.out.print("Which number you do not want to see:  ");
        skipNumber = input.nextInt();

        for (int number = start; number <= end; number++) {
            if (number == skipNumber)
                continue;
            System.out.print(number + " ");
        }

    }

}
