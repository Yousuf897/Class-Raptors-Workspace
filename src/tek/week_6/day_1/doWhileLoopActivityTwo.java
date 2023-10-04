package tek.week_6.day_1;

import java.util.Scanner;

public class doWhileLoopActivityTwo {

/*    Activity 2: Age Verification

	1	Prompt the user to enter their age.
	2	If they enter an age less than 0 or more than 150, display an error message.
    3	Using a do-while loop, keep prompting them until they enter a valid age.
	4	Once a valid age is entered, display a message saying "Age verified."

	*/

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        int age;

        do {
            System.out.print("Please enter your age: ");
            age = input.nextInt();

            if ( age < 0 || age > 150 ) {
                System.out.println("Invalid Age!, re-enter the age");
            }

        } while ( age < 0 || age > 150 );

        System.out.println("Age verified.");

    }

}
