package tek.review.day_2;

import java.util.ArrayList;

public class IssueWithArray {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] studentNames = {"Alex", "Trevor","Erin", "Eric"};

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        ArrayList<String> listOfStudents = new ArrayList<>();

        // Some of the methods available for the arrayList
        for ( int i = 1; i <= 6; i++) {
            listOfNumbers.add(i);
        }

        for (String stdName : studentNames ) {
            listOfStudents.add(stdName);
        }

        // print the list
        System.out.println( listOfNumbers );

        // print the list of students
        System.out.println( listOfStudents );

        // Remove value
        listOfStudents.remove("Eric");

        // print the updated list
        System.out.println( listOfStudents );

        // Remove value based on the index
        listOfStudents.remove(0);

        // print the updated list
        System.out.println( listOfStudents );



    }

}
