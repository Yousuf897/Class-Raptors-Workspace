package tek.week_4.day_2;

public class LogicalORActivityTwo {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        String message;

        num1 = 10;
        num2 = 20;
        num3 = 10;
        num4 = 10;

        if (num1 == num2 || num3 == num4)  {
            System.out.println("All variables have the same values");
        } else {
            System.out.println("The values are not the same!");
        }

        if ((num1 == num2 || num3 == num4)) {
            System.out.println("All variables have the same values");
        } else {
            System.out.println("The values are not the same!");
        }


        message = (num1 == num2 || num3 == num4) ? "All variables have the same values" : "The values are not the same!";

        System.out.println(message);

        System.out.println((num1 == num2 || num3 == num4) ? "All variables have the same values" : "The values are not the same!");

    }
}
