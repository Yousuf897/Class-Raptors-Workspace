package tek.week_4.day_3;

public class RelationalActivityThree {
    /*
    *   Age Group Classification

      Objective: Classify individuals into age groups based on their age.

    You're designing a system that categorizes individuals into age groups:
    * Child (0-12),
    * Teenager (13-19),
    * and
    * Adult (20 and above).
    A user provides their age: int userAge = 15; (This value can be changed for testing).
    Determine the user's age group.
    Print out the age group of the user.
    *
    * */

    public static void main(String[] args) {
        int userAge = 15;

        boolean isChild, isTeenager;

        isChild = userAge <= 12;
        isTeenager = userAge >= 13 && userAge <= 19;

        if (isChild) {
            System.out.println("You are classified as child!");
        } else if (isTeenager) {
            System.out.println("You are classified as Teenager!");
        }  else {
            System.out.println("You are classified as Adult!");
        }


        if (userAge <= 12)  {
            System.out.println("You are classified as child!");
        } else if (userAge >= 13 && userAge <= 19) {
            System.out.println("You are classified as Teenager!");
        } else {
            System.out.println("You are classified as Adult!");
        }

    }
}
