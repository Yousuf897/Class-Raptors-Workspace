package tek.week_4.day_2;

public class LogicalOROperator {

    /*2. OR (||): At least one condition must be true.

        true || true = true
        true || false = true
        false || true = true
        false || false = false

*/

    public static void main(String[] args) {
        int num1, num2, num3, num4, resultOfFirstAndSecond, resultOfThirdAndFourth;

        num1 = 10;
        num2 = 20;
        num3 = 10;
        num4 = 10;

        resultOfFirstAndSecond = num1 + num2;
        resultOfThirdAndFourth = num3 + num4;

        if (resultOfFirstAndSecond == resultOfThirdAndFourth) {
            System.out.println("Both results are the same");
        } else {
            System.out.println("The results are not the same!");
        }

        if (num1 == num2 || num3 == num4)  {
            System.out.println("All variables have the same values");
        } else {
            System.out.println("The values are not the same!");
        }
    }
}
