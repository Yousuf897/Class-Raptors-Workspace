package tek.review.day_1;

public class ConditionalStatemenetsTwo {

    public static void main(String[] args) {

        int i = 10;
        int j = 20;

        if ( i < j || i > j && i <= j || i >= j ) {
            System.out.println("A");
            if ( i < j ) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else {
            System.out.println("F");
        }
    }
}



