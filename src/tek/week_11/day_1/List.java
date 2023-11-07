package tek.week_11.day_1;

import java.util.ArrayList;

public class List {

/*  Real-life Analogy:

    Consider a train where each compartment can hold a passenger. An ArrayList is like a train that can expand by adding more compartments
    as needed. You can easily get on at any compartment (insert an element at any position), get off (remove an element),
    or find out who is in compartment 10 (access an element at a given index). If the train gets too long (the ArrayList
    grows beyond its capacity), it’s automatically extended with more compartments (the underlying array is resized).

    Explanation in Programming:

    An ArrayList is a resizable-array implementation of the List interface in Java. It provides a way to store a dynamic list of
    objects—meaning that items can be added and removed, and the list will resize itself dynamically. It's part of the java.util
    package.

    Key Characteristics of ArrayList:

    1. Resizable Array: Unlike regular arrays, an ArrayList can grow and shrink in size dynamically.

    2. Ordered Collection: It maintains the insertion order, so elements can be accessed in the sequence they were added.

    3. Index-Based Access: Elements can be accessed by their index in the list, with the first index starting at 0.

    4. Allows Duplicates: You can have multiple elements that are identical in an ArrayList.

            Non-Synchronized: ArrayList is not thread-safe, which means if multiple threads are accessing it at the same time,
            you need to provide your own synchronization.

    Random Access: ArrayList implements the RandomAccess interface, meaning you can quickly retrieve elements at any index.

 */

    public static void main(String[] args) {

        String[] arrayNames = {"Bob", "Alex", "Lydia"};

        System.out.println( arrayNames[0] );

        ArrayList<String> listOfName = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // adding elements to ArrayList .add();
        listOfName.add("Bob");
        listOfName.add("Alex");
        listOfName.add("Lydia");
        listOfName.add("Lydia");
        listOfName.add(null);
/*      listOfName.add(1);*/  // Because of the type safety I cannot add an integer value because the type in my ArrayList is String!

        System.out.println( listOfName );

        listOfName.add(3, "Mike");

        System.out.println( listOfName );

        // modify elements in arrayList on a specific index
        listOfName.set(1, "Alex updated");

        System.out.println( listOfName );

        // removing element from arrayList based on index!
        listOfName.remove(1);

        System.out.println( listOfName );

        // remove element based on the object (value), if you don't know the index number!
        listOfName.remove("Bob");

        System.out.println( listOfName );

        // check for availability of an element in list -> Contains method gives you true or false! -> return type.
        System.out.println(  listOfName.contains("Bob") ) ;

        // check for availability of an element in list
        System.out.println(  listOfName.contains("Mike") ) ;

        // remove all elements from the arrayList
        listOfName.removeAll(listOfName);

        System.out.println( listOfName );

        // Going through the elements one by one using the enhanced for loop
        for (String name : listOfName) {
            System.out.println( name );
        }

        // Revised version of enhanced for loop
        listOfName.forEach(System.out::println);

        listOfName.add("Tek");
        listOfName.add("School");
        listOfName.add("Tek");

        System.out.println( listOfName );

        listOfName.remove("Tek");

        listOfName.add("Tek");
        listOfName.add("Tek");
        listOfName.add("Tek");
        listOfName.add("Tek");

        System.out.println( listOfName );





    }

}
