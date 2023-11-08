package tek.week_11.day_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

/*
    A LinkedHashSet in Java is a combination of hash table and linked list implementation of the Set interface, with predictable
    iteration order. It inherits the features of HashSet but also maintains a doubly-linked list across all elements. This linked
    list defines the iteration ordering, which is normally the order in which elements were inserted into the set (insertion-order).

    Here's a real-life example to help understand:

    Imagine you're a teacher keeping track of the order in which students submit their assignments. You want to ensure that each
    student only submits once (no duplicates), but you also want to maintain the order of submission for record-keeping purposes.

    Using a LinkedHashSet can serve this purpose well:

    It will prevent any duplicate submissions since it's a set.
    It will maintain the order of submissions, thanks to its linked list aspect.

    In programming terms, here are the key points of LinkedHashSet:

    No Duplicate Elements: Just like HashSet, LinkedHashSet does not allow duplicate elements. If you attempt to add a duplicate,
    the call will simply be ignored.

    Ordering: It maintains a doubly-linked list running through its elements, which means it orders them by their insertion order.

    This is different from the HashSet that does not guarantee any specific ordering of elements.

    Performance: The insertion and deletion in a LinkedHashSet are slightly less efficient than HashSet because of the additional overhead of maintaining the linked list. However, the difference is typically negligible.
    Iteration: Iterating through a LinkedHashSet is faster than iterating through a HashSet, especially when the set is large, because the linked list dictates the iteration order and does not depend on the initial capacity or the load factor.
*/

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        LinkedHashSet<String> setOfNames = new LinkedHashSet<>();

        // add elements to LinkedHashSet
        setOfNames.add("Bob");
        setOfNames.add("Lydia");
        setOfNames.add("Alex");

        // Print the values
        System.out.println( setOfNames );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // foreach loop (enhanced for loop) to iterate through the elements of your set
        for (String name : setOfNames) {
            System.out.println( name );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // enhanced version of the for each loop
        setOfNames.forEach(System.out::println);

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // removing the element from your set
        setOfNames.remove("Lydia");

        // printing the set after deletion
        System.out.println( setOfNames );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // clearing all of the elements from your set
        setOfNames.clear();

/*        // printing the set after clear
        System.out.println( setOfNames );*/

        setOfNames.removeAll(setOfNames);

        System.out.println(setOfNames );

/*
        names.add("a");
        names.add("b");
        names.add("c");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }*/



    }

}
