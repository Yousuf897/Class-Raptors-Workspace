package tek.review.day_2;

public class Calculator {

    public static void main(String[] args) {

        System.out.println( add(20, 20) );
        System.out.println( add(10.5, 9.5) );
        System.out.println( add(10.5, 9) );
        System.out.println( add(10, 9, 200) );

    }

    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static double add(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static double add(double numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int add(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo + numberThree;
    }

}
