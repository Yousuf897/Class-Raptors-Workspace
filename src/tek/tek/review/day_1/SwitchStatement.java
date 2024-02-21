package tek.review.day_1;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        int number;
        String dayOfWeek;
        var input = new Scanner(System.in);

        System.out.print("Enter a digit value from 1 to 7: ");
        number = input.nextInt();

        switch (number) {
            case 1:
                dayOfWeek = "Monday";
                System.out.println(dayOfWeek);
                break;
            case 2:
                dayOfWeek = "Tuesday";
                System.out.println(dayOfWeek);
                break;
            case 3:
                dayOfWeek = "Wednesday";
                System.out.println(dayOfWeek);
                break;
            case 4:
                dayOfWeek = "Thursday";
                System.out.println(dayOfWeek);
                break;
            case 5:
                dayOfWeek = "Friday";
                System.out.println(dayOfWeek);
                break;
            case 6:
                dayOfWeek = "Saturday";
                System.out.println(dayOfWeek);
                break;
            case 7:
                dayOfWeek = "Sunday";
                System.out.println(dayOfWeek);
                break;
            default:
                System.out.println("Invalid input, Please try again");
        }
        input.close();
    }

}
