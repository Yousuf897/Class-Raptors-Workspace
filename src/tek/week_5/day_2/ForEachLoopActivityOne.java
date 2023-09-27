package tek.week_5.day_2;

public class ForEachLoopActivityOne {

    /*
    *   Activity 1: Printing Elements

        You are given an array of colors: String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple"};.
        Using a for-each loop, write a program that prints each color in the array.
    *   The output should display each color on a new line.
    * */

    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple"};

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
