package tek.week_11.day_2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExp {

 /*   A TreeMap in Java is a map implementation that keeps its entries sorted according to the natural ordering of its keys, or by a
 Comparator provided at map creation time, depending on which constructor is used.

    Key Features of TreeMap:

    1. Ordering: The map is sorted according to the natural ordering of its keys, or by a comparator provided at the time of creation.
    This means iterating over the keys of a TreeMap will be done in ascending key order.

    Key Restriction: The keys that are inserted into a TreeMap must implement the Comparable interface or be accepted by the provided
    comparator.

    Performance: Offers log(n) time cost for the containsKey, get, put, and remove operations.
    Tree Structure: It is a Red-Black tree-based NavigableMap implementation.

    When to Use TreeMap:

    When you need a map that will always be sorted by the key.
    When you want to be able to extract entries in a sorted order.
*/

    public static void main(String[] args) {

        TreeMap<Integer, String> records = new TreeMap<>();

        // adding the elements to map
        records.put(10, "Bob");
        records.put(1, "Alex");
        records.put(5, "Lydia");
        records.put(10, "Bob");
        records.put(2, "John");
        records.put(4, "Eric");


        // print the entries of the map
        System.out.println( records );

/*        { 1 = Alex, 2 = John, 4 = Eric, 5 = Lydia, 10 = Bob } */

        for (Map.Entry<Integer, String> entry : records.entrySet()) {
            System.out.println( entry.getKey() + " = " + entry.getValue() );
        }
/*
        1 = Alex
        2 = John
        4 = Eric
        5 = Lydia
        10 = Bob
*/

        TreeMap<String, String> names = new TreeMap<>();

        names.put("ID1020", "A");
        names.put("ID102", "A");
        names.put("ID101", "A");
        names.put("ID1010", "A");


        System.out.println( names );

        for (Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println( entry.getKey() + " = " + entry.getValue() );
        }

/*        { A = A , B = A, H = A, Z = A }*/
/*
        A = A
        B = A
        H = A
        Z = A
*/
/*

        {ID101=A, ID1010=A, ID102=A, ID1020=A}

        ID101 = A
        ID1010 = A
        ID102 = A
        ID1020 = A
*/


    }
}
