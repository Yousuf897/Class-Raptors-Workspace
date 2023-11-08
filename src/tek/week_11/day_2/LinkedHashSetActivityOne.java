package tek.week_11.day_2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSetActivityOne {

/*  Activity 1: Unique Name Register

    Objective: To create a register (a LinkedHashSet) that maintains a list of unique names entered by the user. Ensure that
    the order in which the names were added is preserved.

    Steps:

    1. Create a LinkedHashSet to store String objects.
    2. Prompt the user to enter names until they enter "STOP".
    3. Each time a name is entered, attempt to add it to the LinkedHashSet.
    4. If a name was already in the set, inform the user that duplicate entries are not allowed.
    5. After the user enters "STOP", print out all the names in the order they were added.

    SAMPLE OUTPUT:


    Enter names (type 'STOP' to finish):
    John
    John is added.
    Lisa
    Lisa is added.
    John
    John is already in the set. No duplicates allowed.
    Sarah
    Sarah is added.
    STOP

    Names in the register:
    John
    Lisa
    Sarah

    */

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("Enter names (type 'STOP' to finish):");

        while ( !(userInput = input.nextLine() ).equals("STOP"))  {
            if (names.add(userInput) ) {
                System.out.println(userInput + " is added.");
            } else {
                System.out.println(userInput + " is already in the set. No duplicates allowed.");
            }
        }

        System.out.println("Names in the register: ");
        names.forEach(System.out::println);

    }

}
