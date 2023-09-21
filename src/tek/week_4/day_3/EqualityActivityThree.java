package tek.week_4.day_3;

public class EqualityActivityThree {

    /*
    * Password Check

        Objective: To verify if a provided password matches a stored password.

        Your system has a stored password: String storedPassword = "JavaRocks";.
        A user tries to log in and provides a password: String enteredPassword = "JavaRules";
    *   (This value can be changed for testing).
        Check if the entered password matches the stored password.
        Print out if the login is successful or not.
    *
    * */

    public static void main(String[] args) {

        String storedPassword = "JavaRocks";
        String enteredPassword = "JavaRocks";

        if (enteredPassword.equals(storedPassword)) {
            System.out.println("login is successful!");
        } else {
            System.out.println("login is not successful");
        }

        if (!(enteredPassword.equals(storedPassword))) {
            System.out.println("login is not successful");
        } else {
            System.out.println("login is successful!");
        }
    }
}
