package tek.week_5.day_1;

public class OneDiArrayActivityOne {
        /*
        *  Temperature Logger:

        Objective: Store daily average temperatures for a week and retrieve a specific day's temperature.

        Steps:

        1. Declare a 1D array of size 7. This will represent temperatures for seven days.
        2. Assign a temperature value to each day.
        3. To find the temperature on the 4th day, access the element at index 3 (since array indices start from 0).
        4. Print the temperature value retrieved from the array.
        *
        *  */

    public static void main(String[] args) {
        double[] temperatures = new double[7];

        temperatures[0] = 24.5;
        temperatures[1] = 28.6;
        temperatures[2] = 22.9;
        temperatures[3] = 21.2;
        temperatures[4] = 19.1;
        temperatures[5] = 20.7;
        temperatures[6] = 27.1;

        System.out.println( "temperature on the 4th day: " + temperatures[3]);

    }
}
