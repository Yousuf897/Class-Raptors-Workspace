package tek.week_5.day_2;

public class ForEachLoopActivityTwo {
    /*
    * Activity 2: Calculating the Average

    Given an array of integers: int[] grades = {85, 90, 78, 88, 76, 93, 80};.
    Use a for-each loop to traverse through the grades.
    Calculate the average of all the grades in the array and display the result.
    *
    * */

    public static void main(String[] args) {
        int total = 0;
//        int totalLength;
        int[] grades = {85, 90, 78, 88, 76, 93, 80};
//        totalLength = grades.length;

        for (int number : grades) {
            total += number;
        }

//        double average = (double) total / totalLength;
        double average = (double) total / grades.length;

        System.out.println("The average is: " + average);

    }
}
