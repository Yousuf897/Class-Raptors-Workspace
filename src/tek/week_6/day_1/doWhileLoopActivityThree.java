package tek.week_6.day_1;

import java.util.Scanner;

public class doWhileLoopActivityThree {

/*    Activity 3: Password Entry

	1	Set a predetermined password (e.g., "JavaRocks").
    2	Prompt the user to enter the password.
	3	If they enter it incorrectly, display an error message.
    4	Using a do-while loop, keep asking them to enter the password until they get it right.
    5	Once the correct password is entered, display a message saying a

    */

    public static void main(String[] args) {

/*        Scanner input = new Scanner(System.in);
        String password = "JavaRocks";
        String userPassword;

        do {
            System.out.print("Enter the password: ");
            userPassword = input.nextLine();

            if (!userPassword.equals(password)) {
                System.out.println("Incorrect password, try again!");
            }

        } while (!userPassword.equals(password));

        System.out.println("Access granted!");

    }*/
        Scanner input = new Scanner(System.in);
        {

            String StorePassword;
            do {
                System.out.println("Enter your password:");
                StorePassword = input.nextLine();

                if (!StorePassword.equals("JavaRocks")) {
                    System.out.println("invalid Password");
                }
            }

        while (!StorePassword.equals("JavaRocks"));

            System.out.println("Valid Password");

        }
    }
}
