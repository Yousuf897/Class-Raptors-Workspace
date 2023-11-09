package tek.week_11.day_3;

import java.util.Vector;

public class VectorExp {
/*

    In Java, a Vector is a part of the Java Collections Framework and it is similar to an ArrayList, but with two main differences:

    it is synchronized, and it contains many legacy methods that are not part of the collections framework.

    Key Features of Vector:

    1. Synchronization: All of the methods that modify the vector are synchronized, which means they are thread-safe and can be used
    without additional synchronization when accessed from multiple threads. However, this also means that Vector operations are slower
    than ArrayList due to the overhead of synchronization.

    2. Dynamic Array: Like ArrayList, Vector internally uses a dynamic array to store its elements, which means the size of a Vector can
    grow or shrink as needed to accommodate adding and removing items after the Vector has been created.

    3. Legacy Methods: Vector includes methods such as addElement, insertElementAt, elementAt, and removeElement, which are not part of
    the Collection interface.

    4. Capacity Increment: When a Vector needs to grow to accommodate additional elements, it increases its capacity by a certain amount,
    called the capacity increment. If the capacity increment is not specified, the Vector's capacity doubles.

*/

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        // add elements to vector
        vector.add("Bob");
        vector.add("Alex");
        vector.add("Lydia");
        vector.add("Mike");

        // print vector
        System.out.println( vector );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

/*        [Bob, Alex, Lydia, Mike] */

        // Getting the elements based on their index
        System.out.println( vector.get(1) ); // Alex

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // how to update an element
        vector.set(0, "Mike");

        // print the updated vector
        System.out.println( vector );

/*        [Mike, Alex, Lydia, Mike]*/

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // removing an element based on their index
        vector.remove(2);

        // print the updated vector
        System.out.println( vector );

/*        [Mike, Alex, Mike]*/

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // removing an element based on the object
        vector.remove("Mike");

        // print the updated vector
        System.out.println( vector );

/*        [ Alex, Mike ] */

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Loop through the vector elements
        for ( String singleElement : vector ) {
            System.out.println( singleElement );
        }
/*
        Alex
        Mike
*/
        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Printing the capacity of the vector
        System.out.println( vector.capacity() );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Clearing the list
        vector.clear();

        System.out.println( vector );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Printing the capacity of the vector after clearing the elements
        System.out.println( vector.capacity() );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");


    }

}
