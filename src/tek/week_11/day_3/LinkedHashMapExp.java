package tek.week_11.day_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExp {

/*
    A LinkedHashMap is an implementation of the Map interface that combines the hash table functionality of a HashMap with a linked
    list to maintain the insertion order of elements. It is part of the Java Collections Framework.

    Key Features of LinkedHashMap:

    1. Insertion Order: Unlike HashMap, a LinkedHashMap maintains a doubly-linked list running through all of its entries. This linked
    list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order).

    2. Access Order: Optionally, a LinkedHashMap constructor can be used to create a map that maintains the order in which entries were
    last accessed, rather than the order of insertion (access-order). This kind of LinkedHashMap can be used as the basis for a cache,
    such as a least-recently-used (LRU) cache.

    3. Performance: It provides slightly lower performance than HashMap for adding and removing operations, due to the overhead of
    maintaining the linked list. However, iteration over collections views of a LinkedHashMap is faster than that of a HashMap since
    it follows the order of the linked list.

    4. Null Values and Null Keys: Like HashMap, a LinkedHashMap permits null elements as keys and values.
*/

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> studentRecords = new LinkedHashMap<>();

        // add records to my linkedHashMap
        studentRecords.put(505, "Bob");
        studentRecords.put(205, "Bob");
        studentRecords.put(105, "Bob");
        studentRecords.put(605, "Bob");

        // print the records
        System.out.println( studentRecords );

/*        { 505= Bob, 205 = Bob, 105 = Bob, 605 = Bob}  */

        // Modification using linkedHashMap
        studentRecords.put(505, "Lydia");

        // print the updated records
        System.out.println( studentRecords );


/*        { 505 = Lydia, 205 = Bob, 105 = Bob, 605 = Bob}*/

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Getting a specific value based on the key
        System.out.println( studentRecords.get( 505 ) );

//      Lydia

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Creating a loop that goes through each entry (key, value) but prints only keys
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet() ) {
            System.out.println( entry.getKey() );
        }
/*
        505
        205
        105
        605
*/


        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Creating a loop that goes through each entry (key, value) and prints key and value
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet() ) {
            System.out.println( entry.getKey()  + " = " + entry.getValue() );
        }
/*

        505 = Lydia
        205 = Bob
        105 = Bob
        605 = Bob
*/


        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Creating a loop that goes through each entry (key, value) prints only values
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet() ) {
            System.out.println( entry.getValue() );
        }
/*

        Lydia
        Bob
        Bob
        Bob
*/

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");
/*
        for (Integer entry : studentRecords.entrySet()) {

        }*/



    }

}
