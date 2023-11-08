package tek.week_11.day_2;

import java.util.LinkedHashSet;

public class LinkedHashSetActivity {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }

        System.out.println( numbers );

    }

}
