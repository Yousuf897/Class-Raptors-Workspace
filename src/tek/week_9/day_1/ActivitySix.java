package tek.week_9.day_1;

public class ActivitySix {

    /*
    * Activity 3: intern() method and String Pool

      Objective: Learn about the intern() method and its relationship with the String pool.

    Declare two String variables: one initialized using a literal and another using the new keyword, followed by calling the
    * intern() method, like:

    String str1 = "Hello";
    String str2 = new String("Hello").intern();

    Compare str1 and str2 using the == operator. What's the result?
    What does the intern() method do, and why did it affect the comparison in this way?
    *
    * */

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(  str1 == str2);

        str2 = new String("Hello").intern();

        System.out.println(  str1 == str2);


    }
}
