package tek.week_1.day_3;

public class LogicBehindVariables {

    /*
    *   when you declare a variable in Java, you are essentially reserving a specific
    *   amount of memory in the computer's RAM (Random Access Memory) to store the value of that variable.
    *   The amount of memory allocated depends on the data type of the variable.
    *
    *     For example, if you declare an int variable like this:
    *
    *     int number;
    *
    *   Java reserves 4 bytes of memory to store an integer value for the variable number.
    *
    *   You can think of it as labeling a "box" in your computer's memory,
    *   setting it aside specifically for storing an integer value that will represent number in your
    *   program.
    *
    *   When you initialize the variable, like so:

        int number = 30;

        You're putting the value 30 into that "box." Now, whenever you refer to number in your program,
*       Java will go to that specific location in memory to get or set the value.
    *
    * */

    public static void main(String[] args) {

        int number;
        number = 10;

        System.out.println(number);

        System.out.println(number);
        System.out.println(number);
    }
}
