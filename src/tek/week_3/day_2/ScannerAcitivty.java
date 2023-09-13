package tek.week_3.day_2;

import java.util.Scanner;

public class ScannerAcitivty {

/*
    Imagine going to a department store where they offer gift registrations.
    To get information about the gifts you've registered for, you would give your details to the store
    representative. The representative would then enter this data into their system to
     retrieve and display the list of gifts. In this scenario, the act of the representative
     collecting details from you is analogous to the Scanner in Java, which collects input from
     the user.

    In Java, the Scanner class provides a way to read input of various types from different sources,
    like the keyboard or files. Most commonly for beginners, it's used to read input from the standard
    input, which usually means the keyboard.

    To use the Scanner class, you must first import it from the java.util package:

            import java.util.Scanner;

    After that, you can create an instance (object) of the Scanner class and use its methods to
    read different types of data.


*/

    public static void main(String[] args) {
        // Write a java program that is going to ask for your name -> print your name in this format
        // -> "What is your name: "   -----------
        // -> "Your name is: -------"

       Scanner input = new Scanner(System.in);
       String firstName;

        System.out.print("What is your name: ");
        firstName = input.nextLine();
        System.out.println("Your name is: " + firstName);
        System.out.println("Your name is: " + firstName);
        System.out.println("Your name is: " + firstName);
        System.out.println("Your name is: " + firstName);
        System.out.println("Your name is: " + firstName);
        System.out.println("Your name is: " + firstName);
        System.out.println("Your name is: " + firstName);
    }

}

