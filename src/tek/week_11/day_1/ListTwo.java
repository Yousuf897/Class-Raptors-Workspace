package tek.week_11.day_1;

import java.util.ArrayList;

public class ListTwo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

       for (int i = 1; i <= 15; i++) {
           numbers.add(i);
       }

        System.out.println( numbers );

       // remove 2 from the arrayList
        numbers.remove(1);

        System.out.println( numbers );

        numbers.removeAll(numbers);

        System.out.println( numbers );

    }
}
