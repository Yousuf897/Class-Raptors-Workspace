package tek.week_3.day_3;

import java.util.Scanner;

public class ScannerActivityOne {

    // Ask the user for their first and last name. (Use Scanner)
    // print the entered values side by side
    // For example -> FirstName: Bob
    //             -> LastName: Alex
    // Desired output:
    // Box Alex

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Shortcut to import the package -> Alt + Enter
        String firstName, lastName, fullName;

        System.out.print("What is your firstName: ");
        firstName = input.nextLine();
        System.out.print("What is your lastName: ");
        lastName = input.nextLine();

//        fullName = firstName + " " + lastName;
        fullName = firstName.concat(" ").concat(lastName);

        System.out.println(firstName + " " + lastName);
        System.out.println(fullName);

//        String fullName;
//        System.out.print("Enter your first and last name followed by a space: ");
//        fullName = input.nextLine();
//        System.out.println(fullName);

    }
}
