package tek.week_9.day_1;

public class ActivityOne {

    /*
    *
    *   Activity 1: String Literal

        Objective: Understand the concept of String literals and their storage mechanism.

        Declare two String variables and initialize them with the same literal, like:

        String str1 = "Hello";
        String str2 = "Hello";

        Use the == operator to compare str1 and str2. What do you observe?
        Can you explain why the comparison resulted in the observed value based on the concept of String literals and the String pool?
    *
    * */


    public static void main(String[] args) {

        // -- PART 1

        String str1 = " Hello ";
        String str2 = " Hello ";
        String str3 = " Hello ";
        String str4 = " Hello ";
        String str5 = " Hello ";
        String str6 = " Hello ";
        String str7 = " Hello ";
        String str8 = " Hello ";

        System.out.println( str3.hashCode() );
        System.out.println( str4.hashCode() );

        str1 = "Bob";

        int number = 10;

        System.out.println( str1.hashCode() );
        System.out.println( str2.hashCode() );

        System.out.println( str1 == str2 );

        System.out.println(str1);
        System.out.println(number);

       //  String[] names = {"Bob", "Lydia", "Alex"};

        // -- PART 2

/*      char char1 = 'A';
        char char2 = 'A';

        System.out.println(char1.);

        System.out.println(char1 == char2);*/

    }

}
