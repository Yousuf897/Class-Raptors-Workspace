package tek.week_6.day_3;

public class MethodExampleFour {

    public static void main(String[] args) {

        int numberOne  = 10;
        int numberTwo = 20;

        System.out.println("The sum of " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));

        int numberThree = 50;
        int numberFour = 60;

        System.out.println("The sum of " + numberThree + " + " + numberFour + " = " + sumOfTwoNumbers(numberThree, numberFour));
    }


    public static int sumOfTwoNumbers(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
         return result;
    }


}
