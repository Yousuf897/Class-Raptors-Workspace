package tek.week_4.day_1;

public class SwitchStatementActivity {
    /*
        Switch Statement Activity

    *     1.Declare an integer variable dayNumber and assign a value between 1 and 7 to it.
          2. Using a switch statement, write cases to determine the name of the day corresponding to the number
    *       (where 1 represents Monday and 7 represents Sunday).
          3. What day name did you get for your assigned number?
         4. Change the value of dayNumber and see if your switch case handles all the numbers correctly.
         5. What is the output for an invalid number like 0 or 8?
    *
    */

    public static void main(String[] args) {

        int dayNumber = 7;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
            case 6:
                System.out.println("Saturday!");
                break;
            case 7:
                System.out.println("Sunday!");
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }
}
