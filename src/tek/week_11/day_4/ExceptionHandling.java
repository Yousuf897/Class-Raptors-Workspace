package tek.week_11.day_4;

public class ExceptionHandling {

/*
    Exception handling in Java is a powerful mechanism that allows a programmer to handle runtime errors, thus maintaining the normal
    flow of the application. An exception is an event that occurs during the execution of a program and disrupts the normal flow of
    instructions. This could be due to a variety of reasons, such as user error, hardware failure, resource exhaustion, or bugs in
    the code.

    Here's an overview of how exception handling works in Java:

    1. Try-Catch Block:

    The most common way of handling exceptions is by using try-catch blocks. You wrap the code that might throw an exception in a
    try block, and you handle the exception in the catch block.


    2. Finally Block:

  A finally block can be used after or in place of catch blocks. It contains code that is always executed after the try and
catch blocks, regardless of whether an exception was thrown or caught.

 3.Throw:

The throw keyword is used to explicitly throw an exception. You can throw either checked or unchecked exceptions.
Checked exceptions need to be declared in the method's throws clause.

4. Throws Clause:

Methods that could throw checked exceptions must declare them using the throws keyword in the method signature.

*/

    public static void main(String[] args) {

        System.out.println("Before Running");

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide number by zero!");
        } finally {
            System.out.println("Finally message");
        }

        System.out.println("After Running");



   /*     printNumber(0);*/

  /*      divideTheNUmber(10, 0);*/


        try {
            divideNumber(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

/*
        System.out.println( divideTheNUmber(10, 0));
*/


    }

    static void printNumber(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Cannot be accepted");
        } else {
            System.out.println("The number is: " + number);
        }
    }


    static int divideTheNUmber(int numberOne, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide a number by zero");
        } else {
            return number2 /  numberOne;
        }
    }

    static int divideNumber(int numberOne, int numberTwo) throws ArithmeticException {
        if(numberTwo == 0) {
            throw new ArithmeticException("Cannot divide the number by zero!");
        }
        return numberOne / numberTwo;
    }


}
