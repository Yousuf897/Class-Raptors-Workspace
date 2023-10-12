package tek.week_7.day_2;

import java.util.Scanner;

public class Calculator {

    Scanner input = new Scanner(System.in);

    /*
     Create a class called Calculator
     Declare two Instance variable called numberOne and numberTwo;

     Create two methods, one to calculate sum of two numbers and the other to calculate the multiplication of two numbers*/

    double numberOne;
    double numberTwo;

    public double sumOfTwoNumbers() {
        return numberOne + numberTwo;
    }

    public double multiOfTwoNumbers() {
        return numberOne * numberTwo;
    }

    public void printSumOfTwoNumbers() {
        System.out.println("The result of " + numberOne + " + " + numberTwo + " = " + sumOfTwoNumbers() );
    }

    public void printMultiOfTwoNumbers() {
        System.out.println("The result of " + numberOne + " * " + numberTwo + " = " + multiOfTwoNumbers() );
    }

    public void getUserInput() {
        System.out.print("Enter the value for numberOne: " );
        numberOne = input.nextDouble();
        System.out.print("Enter the value for numberTwo: " );
        numberTwo = input.nextDouble();
    }

}
