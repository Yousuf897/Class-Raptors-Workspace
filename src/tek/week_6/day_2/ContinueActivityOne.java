package tek.week_6.day_2;

public class ContinueActivityOne {

    public static void main(String[] args) {

        // Print the numbers from 1 to 10 but skip 5 or 7

        for (int number = 1; number <= 10; number++) {

            if ( number == 5 || number == 7 )
                continue;
            System.out.print(number + " ");
        }

    }
}
