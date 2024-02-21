package tek.review.day_1;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

//        ArrayList<Integer> listOfNumbers = new ArrayList<>();
//        for (int number : captureUserInput() ) {
//            listOfNumbers.add(number);
//        }
//
//        System.out.println(findTheLargestAmongTwoValues( listOfNumbers.get(0), listOfNumbers.get(1)));

        System.out.println( calculateGrade(91) );
        System.out.println( calculateGrade(89) );
        System.out.println( calculateGrade(90) );
        System.out.println( calculateGrade(65) );

        // print the largest value in the console
//        System.out.println("The largest value is: " + largestValue);

    }

    // Method to capture the userInput.
    public static ArrayList<Integer> captureUserInput() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        var input = new Scanner(System.in);

        System.out.print("Enter the first number please: ");
        listOfNumbers.add( input.nextInt() );

        System.out.print("Enter the second number please: ");
        listOfNumbers.add( input.nextInt() );

        return listOfNumbers;
    }

    // A method that is going to give us the largest value among two values
    public static int findTheLargestAmongTwoValues(int numberOne, int numberTwo ) {
        int largestValue = 0;
        // Condition statement to perform the similar task
        return largestValue = ( numberOne < numberTwo ) ? numberTwo : numberOne;
    }

    // A method that is going to accept one parameter and calculates the grade of the student based on
    // the score!
    public static char calculateGrade(int score) {
        char grade;
        if ( score <= 100 && score > 90 ) {
            grade = 'A';
        } else if ( score < 90 && score >= 80) {
            grade = 'B';
        } else if ( score < 80 && score >= 70 ) {
            grade = 'C';
        }  else {
            grade = 'f';
        }

        return grade;
    }

}
