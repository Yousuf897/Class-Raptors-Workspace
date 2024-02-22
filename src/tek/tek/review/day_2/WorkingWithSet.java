package tek.review.day_2;

import java.util.HashSet;
import java.util.TreeSet;

public class WorkingWithSet {



    public static void main(String[] args) {
        int[] numbers = {1, 1, 23, 23, 0, 2, 5, 6, 10, 9, 8, 0};

        HashSet<Integer> setOfNumbers = new HashSet<>();
        TreeSet<Integer> sortedSetOfNumbers = new TreeSet<>();

        for (int number : numbers) {
            setOfNumbers.add(number);
            sortedSetOfNumbers.add(number);
        }


        // print the unique numbers from the set
        System.out.println( setOfNumbers );

        // print the unique sorted numbers from the TreeSet
        System.out.println( sortedSetOfNumbers );
    }
}
