package tek.week_11.day_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapActivity  {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> linkedHashMapTwo = new LinkedHashMap<>();


        // adding entries to LinkedHashMap
        linkedHashMap.put(509, "Bob");
        linkedHashMap.put(506, "Lydia");
        linkedHashMap.put(501, "Alex");
        linkedHashMap.put(503, "Bob");
        linkedHashMap.put(500, "Mike");

        // print the LinkedHashMap
        System.out.println( linkedHashMap );

/*        { 509 = Bob, 506 = Lydia, 501 = Alex, 503 = Bob, 500 = Mike} */

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // adding entries to TreeMap
        treeMap.put(509, "Bob");
        treeMap.put(506, "Lydia");
        treeMap.put(501, "Alex");
        treeMap.put(503, "Bob");
        treeMap.put(500, "Mike");

        // print the TreeMap
        System.out.println( treeMap );

/*      { 500 = Mike, 501 = Alex, 503 = Bob, 506 = Lydia, 509 = Bob } */

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        for (Integer key :  linkedHashMap.keySet() ) {
 //           System.out.println( key);
 //           System.out.println( linkedHashMap.get(key) );
            System.out.println(  key +  " = " + linkedHashMap.get(key) );
        }
/*
        509
        506
        501
        503
        500
*/
/*

        Bob
        Lydia
        Alex
        Bob
        Mike
*/
/*
        509 = Bob
        506 = Lydia
        501 = Alex
        503 = Bob
        500 = Mike
*/

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");


        linkedHashMapTwo.put("A", 101);
        linkedHashMapTwo.put("Z", 102);
        linkedHashMapTwo.put("H", 103);
        linkedHashMapTwo.put("D", 104);


        // print the values
        System.out.println( linkedHashMapTwo );

/*        {A=101, Z=102, H=103, D=104}*/

        for (Map.Entry<String, Integer> entry : linkedHashMapTwo.entrySet() ) {
            System.out.println( entry.getKey()  + " = " + entry.getValue() );
        }
/*
        A = 101
        Z = 102
        H = 103
        D = 104
*/

        for (String key : linkedHashMapTwo.keySet()) {
            System.out.println( key );
        }
/*

        A
        Z
        H
        D
*/


    }

}
