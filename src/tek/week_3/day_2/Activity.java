package tek.week_3.day_2;

public class Activity {
    public static void main(String[] args) {

        // get the maximum range for int
        // get the maximum range for the short
        // create a variable and try to exp cast the max value of int into short
        // print the result.

        int intNumber = Integer.MAX_VALUE;

        System.out.println(intNumber);
        short shortNumber = Short.MAX_VALUE;

        System.out.println(shortNumber);

        shortNumber = (short) intNumber;

        System.out.println(shortNumber);


    }
}
