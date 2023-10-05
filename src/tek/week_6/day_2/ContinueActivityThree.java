package tek.week_6.day_2;

public class ContinueActivityThree {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

/*        for ( int i = 0; i < numbers.length; i++) {

            if ( numbers[i] == 2 || numbers[i] == 3 || numbers[i] == 4 )
                continue;
            System.out.print(numbers[i] + " ");

        }*/

        int index = 0;

        while ( index < numbers.length) {

            if ( numbers[index] == 2 || numbers[index] == 3 || numbers[index] == 4 ) {
                index++;
                continue;
            }
            System.out.print(numbers[index] + " ");


        }


    }

}
