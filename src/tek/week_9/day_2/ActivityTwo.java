package tek.week_9.day_2;

public class ActivityTwo {

    
    /*
    Basic Calculator:

    Create a class Calculator.

    Design overloaded methods for a
        1.One that takes two integers.
        2.One that takes three integers.
        3.One that takes two doubles.

    Test the methods by creating a main method and invoking the add() method with different parameters.

    */

    public static void main(String[] args) {

        var calObj = new Calculator();

        System.out.println( calObj.add(5,1) );
        System.out.println( calObj.add(5,1, 10) );
        System.out.println( calObj.add(5.0,1) );

    }

}
