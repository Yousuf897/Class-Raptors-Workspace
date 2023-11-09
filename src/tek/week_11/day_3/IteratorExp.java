package tek.week_11.day_3;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExp {

/*
    An Iterator is an object that enables you to traverse through a collection of data (such as lists, sets, or maps) and to remove
    elements from the collection if needed, without causing ConcurrentModificationException. It is part of the java.util package.

    Key Features of Iterator:

    1. Universal Cursor: It acts as a universal cursor for the Java Collections Framework, providing a common way to access elements
    sequentially across all collection types.

    2. Safe Removal: It provides a safe way to remove elements from a collection while iterating over it, which you cannot do directly
    with a for-each loop.

    Methods: The Iterator interface provides three main methods:

    hasNext(): Returns true if the iteration has more elements.
    next(): Returns the next element in the iteration.
    remove(): Removes the last element returned by the iterator from the underlying collection.

*/


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Lydia");
        names.add("Mike");
        names.add("Alex");
        names.add("Eric");


        // print the values using the loop
        for (String name : names) {
            System.out.println( name );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // or
        names.forEach(System.out::println);

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        Iterator<String> iterator = names.iterator();

        while ( iterator.hasNext() ) {
          String name = iterator.next();
          System.out.println(name);

/*        System.out.println( iterator.next() );*/

            if ("Alex".equals(name)) {
                iterator.remove();
            }
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        System.out.println("ArrayList after remove: ");
        System.out.println( names );

/*      ArrayList after remove:
        [Bob, Lydia, Mike, Eric]*/

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");




    }

}
