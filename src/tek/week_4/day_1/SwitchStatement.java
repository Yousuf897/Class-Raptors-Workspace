package tek.week_4.day_1;

public class SwitchStatement {
    /*
    * Real-life analogy:
    Imagine you're at a beverage dispenser machine with multiple options. Based on the button you press (choice),
    * the machine gives you a specific drink like coffee, tea, or juice.
*   If you press a button that's not configured, the machine might just give you water as a default option.
*
*   Java-related explanation:
    The "switch" control statement in Java allows you to make decisions based on multiple
*   discrete values of a variable or expression. Instead of writing multiple "if-else" statements,
*   you can use a "switch" to handle different cases more cleanly.
*
*
*
* */

    public static void main(String[] args) {
        String beverageChoice = "coffee";

        switch (beverageChoice) {
            case "coffee":
                System.out.println("your choice is coffee!");
                break;
            case "tea":
                System.out.println("your choice is Tea!");
                break;
            case "soda":
                System.out.println("your choice is soda!");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Outside of the switch block");

    }
}
