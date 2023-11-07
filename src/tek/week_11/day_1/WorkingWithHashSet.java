package tek.week_11.day_1;

import java.util.HashSet;

public class WorkingWithHashSet {

/*
    In Java, a HashSet is a collection class used to create a collection that uses a hash table for storage. It implements the Set
    interface and extends AbstractSet.

    No Duplicate Elements: HashSet does not allow duplicate elements. That means you can add an element only once in a HashSet.
    If you try to add a duplicate, the add method will simply return false, and the element will not be re-added.

    No Order Guarantee: HashSet does not maintain any kind of order for its elements. There's no guarantee that the order will
    remain constant over time.

    Null Allowed: It allows at most one null value.

    Performance: It provides constant time performance for basic operations (add, remove, contains, and size), assuming
    the hash function disperses the elements properly among the buckets. This constant time performance is one of the main benefits
    of using a HashSet.

    Hashing: It uses the hashCode() method of the objects being stored to determine where they should be placed in the hash table.

    Initial Capacity and Load Factor: When initializing a HashSet, you can specify an initial capacity and load factor. The capacity
    is the number of buckets in the hash table, and the load factor is a measure of how full the hash table is allowed to get before
    its capacity is automatically increased.

    Iteration Performance: The iteration over a HashSet is proportional to the number of elements plus the "capacity" (the number
    of buckets). So, it's important not to set the initial capacity too high if iteration performance is important.

    Use Cases: You typically use a HashSet when you want to prevent duplicates and the order of elements is not important. It is
    particularly useful when you need to test frequently if an object is part of a set or not.

*/

    public static void main(String[] args) {

        String[] fruits = { "apple", "cherry", "apple", "cherry"};

        HashSet<String> names = new HashSet<>();
        HashSet<String> fruitsSet = new HashSet<>();

        names.add("Alex");
        names.add("Lydia");
        names.add("Bob");
        names.add("Mike");
        names.add("Eric");
        names.add("Justin");
        names.add("Alex");
        names.add(null);
        names.add(null);

        // printin the values of set
        System.out.println( names );

        // remove element
        names.remove("Alex");

        System.out.println( names );

        for (String fruit : fruits ) {
            fruitsSet.add(fruit);
        }

        // print the values of the fruitSet
        System.out.println( fruitsSet );

    }

}
