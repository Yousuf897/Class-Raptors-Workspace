package tek.week_9.day_1;

public class ActivityFour {


    /*
    *
    * Activity 1: String Literal with new keyword

    Objective: Grasp the difference between creating a String using the new keyword and String literals.

    Declare two String variables: one initialized using a literal and another using the new keyword, like:

    String str1 = "Hello";
    String str2 = new String("Hello");

    Use the == operator to compare str1 and str2. What's the result?
    Can you explain why the comparison resulted in the observed value, considering how the new keyword works with Strings?

    * */

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println( str1 == str2 );


    }


}
