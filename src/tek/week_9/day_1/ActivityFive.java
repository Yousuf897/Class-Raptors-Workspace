package tek.week_9.day_1;

public class ActivityFive {

/*    Activity 2: String Pool

    Objective: Understand the optimization provided by the String pool.

    Create a few Strings using the same literals, like:

    String s1 = "Java";
    String s2 = "Java";
    String s3 = "Ja" + "va";

    Compare each pair (s1 with s2, s1 with s3, and s2 with s3) using the == operator. What do you observe?
    Based on your knowledge of the String pool, can you explain the result of each comparison?

    */

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Ja" + "va"; // -> Ja + va =   " Java ";


        System.out.println( s1 == s2 );
        System.out.println( s1 == s3);
        System.out.println( s2 == s3 );
    }


}
