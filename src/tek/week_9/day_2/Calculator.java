package tek.week_9.day_2;

public class Calculator {

        /*
    Basic Calculator:

    Create a class Calculator.

    Design overloaded methods for a
        1.One that takes two integers.
        2.One that takes three integers.
        3.One that takes two doubles.

    Test the methods by creating a main method and invoking the add() method with different parameters.

    */

    int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    int add(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo + numberThree;
    }

    double add(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }
}
