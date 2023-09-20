package tek.week_4.day_2;

public class LogicalAndActivity {

    /*
    *   1. Declare four variables
    *   2. Initialize random values
    *   3. Declare one variable with the name resultOfFirstAndSecond;
    *   4. Declare another variable with the name resultOfThirdAndFourth;
    *   5. if the value of resultOfFirstAndSecond AND resultOfThirdAndFourth are the same
    *   6. Then print -> Both results are the same
    *   7. Else -> Print -> The results are not the same!
    * */

    /*
    *   compare the value of first and second AND third and fourth
    *   if all the variables have the same values -> print -> All variables have the same values
    *   otherwise print -> The values are not the same!
    * */

    public static void main(String[] args) {

        int num1, num2, num3, num4, resultOfFirstAndSecond, resultOfThirdAndFourth;

        num1 = 10;
        num2 = 10;
        num3 = 10;
        num4 = 10;

        resultOfFirstAndSecond = num1 + num2;
        resultOfThirdAndFourth = num3 + num4;

        if (resultOfFirstAndSecond == resultOfThirdAndFourth) {
            System.out.println("Both results are the same");
        } else {
            System.out.println("The results are not the same!");
        }

        if (num1 == num2 && num3 == num4)  {
            System.out.println("All variables have the same values");
        } else {
            System.out.println("The values are not the same!");
        }

    }
}
