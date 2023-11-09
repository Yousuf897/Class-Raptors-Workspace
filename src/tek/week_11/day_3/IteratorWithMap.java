package tek.week_11.day_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorWithMap {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Bob");
        map.put(102, "Alex");
        map.put(103, "Lydia");
        map.put(104, "Eric");

        System.out.println( map.get(102) );

        Iterator<Map.Entry<Integer, String> > iterator = map.entrySet().iterator();

        while ( iterator.hasNext() ) {
            Map.Entry<Integer, String> entry  = iterator.next();
            System.out.println( entry.getKey() + " = " + entry.getValue() );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

/*
        101 = Bob
        102 = Alex
        103 = Lydia
        104 = Eric
*/

        Iterator<Integer> mapKey = map.keySet().iterator();

        while( mapKey.hasNext() ) {
            Integer key = mapKey.next();
//          System.out.println( key );
            System.out.println( key + " = " + map.get(key) );
        }
/*
        101
        102
        103
        104
*/
/*
        101 = Bob
        102 = Alex
        103 = Lydia
        104 = Eric
*/

    }


}
