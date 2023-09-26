package tek.week_5.day_1;

import java.util.Scanner;

public class UserInputStoreArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("Enter the first number: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter the second number: ");
        numbers[1] = input.nextInt();

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println("The sum of " + numbers[0] + " + " + numbers[1] + " = " + ( numbers[0] + numbers[1] ));
    }
}
