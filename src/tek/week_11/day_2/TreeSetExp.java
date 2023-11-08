package tek.week_11.day_2;

import java.util.*;

public class TreeSetExp {

/*

    A TreeSet in Java is a part of the Java Collections Framework and it stores elements in a tree structure which is always in ascending
    order by default, making it an excellent choice for storing sorted data. It implements the SortedSet interface, which extends Set,
    and ensures that the elements are sorted according to their natural order, or by a Comparator provided at set creation time,
    depending on which constructor is used.

    Here are some characteristics of TreeSet:

    Ordering: The elements in a TreeSet are sorted according to their natural ordering, or by a Comparator provided at the time of
    creation of the set.

    No Duplicates: Like other sets, it does not allow duplicate elements. If an attempt is made to insert a duplicate element, that
    insertion is silently ignored.

    Efficiency: Operations such as adding, removing, and searching elements have a time complexity of O(log n) since it is based on
    a tree structure.

    Null Elements: A TreeSet does not allow the insertion of null elements if it is using the natural ordering because it will throw
    a NullPointerException since it cannot compare null with non-null values.

*/


    public static void main(String[] args) {


        TreeSet<Integer> numbers = new TreeSet<>();

        // add elements
        numbers.add(10);
        numbers.add(22);
        numbers.add(55);
        numbers.add(1);
        numbers.add(0);

        // print the elements
        System.out.println( numbers );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Loop through the elements
        for (Integer number : numbers) {
            System.out.println( number );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // enhanced version of the for each
        numbers.forEach(System.out::println);

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Removing the values
        numbers.remove(1);

        // print after removing the elements
        System.out.println( numbers );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // print the first value of TreeSet
        System.out.println( numbers.first() );

        // print the last value of TreeSet
        System.out.println( numbers.last() );


/*
        for (Integer number : numbers) {
            listOfNumbers.add(number);
        }

        System.out.println( listOfNumbers );

        System.out.println( listOfNumbers.get(numbers.size() - 1));
*/

/*        ArrayList<Integer> listOfNumbers = new ArrayList<>(numbers);

        System.out.println( listOfNumbers );

        System.out.println("First element: " + listOfNumbers.get(0));
        System.out.println("Last element: " + listOfNumbers.get(listOfNumbers.size() - 1));*/

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.addAll(numbers);

        System.out.println( listOfNumbers );

    }

}
