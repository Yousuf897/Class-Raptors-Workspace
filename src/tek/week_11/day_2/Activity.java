package tek.week_11.day_2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Activity {


    public static void main(String[] args) {


        HashSet<String> setOfNames = new HashSet<>();
        LinkedHashSet<String> linkedNames = new LinkedHashSet<>();

        // elements added to HashSet
        setOfNames.add("A");
        setOfNames.add("B");
        setOfNames.add("C");
        setOfNames.add("Z");
        setOfNames.add("I");
        setOfNames.add("J");
        setOfNames.add("K");
        setOfNames.add("L");
        setOfNames.add("E");


        // elements added to LinkedHashet
        linkedNames.add("A");
        linkedNames.add("B");
        linkedNames.add("C");
        linkedNames.add("Z");
        linkedNames.add("I");
        linkedNames.add("J");
        linkedNames.add("K");
        linkedNames.add("L");
        linkedNames.add("E");

        // print the elements from HashSet
        System.out.println( setOfNames );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // print the elements from LinkedHashSet
        System.out.println( linkedNames );


/*        [A, B, C, E, I, Z, J, K, L]
 * * * * *  * * * * * * * * * * * * * * * * * * * *
          [A, B, C, Z, I, J, K, L, E]
          * */

        // modify the elements from a set
        if (linkedNames.contains("A")) {
            linkedNames.remove("A");
            linkedNames.add("P");
        }

        // Printing the elements after modification
        System.out.println( linkedNames );
    }
}
