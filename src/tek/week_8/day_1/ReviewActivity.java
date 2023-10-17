package tek.week_8.day_1;

import java.util.Scanner;

public class ReviewActivity {

    public static void main(String[] args) {

        String userInput;
        int userAge;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        userInput = input.nextLine();

        System.out.print("Enter the age: ");
        userAge = input.nextInt();


        Test testObj = new Test(userInput, userAge);
        testObj.printInfo();



    }
}
