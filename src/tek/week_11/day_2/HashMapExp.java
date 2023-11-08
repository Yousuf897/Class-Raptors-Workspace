package tek.week_11.day_2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExp {

/*
    A HashMap is a part of Java's collection framework and provides the basic implementation of the Map interface of Java.
    It stores the data in key-value pairs, and you can access them by an index of another type (e.g., an Integer). One object
    is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of
    the corresponding key.

    Here are some important characteristics of HashMap:

    1. Order: The HashMap class does not guarantee any specific order of its elements.

    2. Null keys and values: HashMap allows one null key and multiple null values in the collection.

    3. Performance: It provides constant-time performance for the basic operations (get and put), assuming the hash function
    disperses the elements properly among the buckets.

    4. Hashing: It uses hashing for storing the elements. Hashing is a process of converting an object into integer form by using
    the method hashCode().

    5. Concurrency: HashMap is unsynchronized and is not thread-safe. Multiple threads can access it at the same time and, if at
    least one thread modifies the map structurally, it must be synchronized externally.
*/

    public static void main(String[] args) {
        // Key -> Value
        // Integer -> String
        // 101: Bob
        // String -> Integer
        // Bob: 101

        HashMap<Integer, String> studentRecords = new HashMap<>();

        // adding records to the map (HashMap)
        studentRecords.put(101, "Bob");
        studentRecords.put(102, "Alex");
        studentRecords.put(103, "Eric");
        studentRecords.put(104, "John");
        studentRecords.put(105, "Lydia");

        // how to get the value based on the key (id)
        System.out.println( studentRecords.get(101) );

        // how to apply the modification
        studentRecords.put(101, "Lydia");

        // how to get the value based on the key (id)
        System.out.println( studentRecords.get(101) );

        // removing and entry from your map
        studentRecords.remove(103);


        // print elements of keys and values
        System.out.println( studentRecords );

/*        { 101 = Lydia, 102 = Alex, 103 = Eric, 104 = John, 105 = Lydia }  */

        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
           /* System.out.println( entry.getKey() + " = " + entry.getValue() );*/
            System.out.println( key+ " = " + value );
        }
/*

        101 = Lydia
        102 = Alex
        103 = Eric
        104 = John
        105 = Lydia
*/

    }

}
