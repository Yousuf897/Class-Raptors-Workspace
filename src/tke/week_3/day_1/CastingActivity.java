package tke.week_3.day_1;

public class CastingActivity {

    public static void main(String[] args) {

    /*  Question number One:

        Declare a variable of type int and assign it a value.
        Declare a variable of type double.
        Assign the int variable to the double variable without using explicit casting.
        Print both variables and observe the results.

    */
        int numberOne = 20;
        double decimalNumber = numberOne;
        System.out.println("Before casting: " + numberOne);
        System.out.println("After casting: " + decimalNumber);

        /*  Question number two:

        Declare a variable of type double and assign it a value with decimal places.
        Declare a variable of type int.
        Explicitly cast the double variable to int and assign it to the int variable.
        Print both variables and observe the results.
    *
    * */

        double number = 10.5;
        int interNumber = (int) number;
        System.out.println("Before the casting: " + number);
        System.out.println("After the casting: " + interNumber);

        int number1 = 5;
        int number2 = 7;
        System.out.println("this is the result: " + number1 +number2 );
        System.out.println("this is the result: " + ( number1 +number2) );

        double Number8 = 254.45;
        System.out.println(Number8);
        int Number9 = (byte) Number8;
        System.err.println(Number9);

        double num1 = 20.25;
        int num2 = (byte) num1;
        System.out.println(num2);

        System.out.println("The minimum int capacity: " + Integer.MIN_VALUE);
        System.out.println("Integer maximum capacity: " + Integer.MAX_VALUE);

        byte byteNumber = -127;

        System.out.println(byteNumber);

        System.out.println("The minimum Byte capacity: " + Byte.MIN_VALUE);
        System.out.println("Byte maximum capacity: " + Byte.MAX_VALUE);

    }

}
