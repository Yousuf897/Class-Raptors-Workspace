package tek.week_3.day_1;


    /* Imagine you have a large container filled with water, and you need to transfer this water
    into a smaller bottle. The large container can hold 2 liters, but your bottle can only hold 500 ml.
     To make the water fit into the smaller bottle, you'd need to pour out only a portion of the water
     from the container, essentially "casting" or converting the large amount of water to a smaller amount.

     Now, in this process, there's a clear loss—you can't fit the entire 2 liters in the 500 ml bottle.
     But sometimes you're okay with that, especially if you only need the smaller bottle for your trip.

       Casting in Java:

    In Java, casting refers to the process where you explicitly (Manually)  convert a value from one
    data type to another, especially when the conversion might not be safe and could lead to
    a potential loss of data.

    Java supports two types of casting:

    1. Widening Casting (Automatically): Converting a smaller data type to a larger data type.
    This is usually safe since there's no data loss.

    int myInt = 10;
    double myDouble = myInt;  // No explicit casting needed


    2. Narrowing Casting (Manually): Converting a larger data type to a smaller one.
    This requires an explicit cast and can lead to data loss, similar to our water example.

    double myDouble = 9.78;
    int myInt = (int) myDouble;  // Explicitly casting double to int



*/
public class Casting {

        public static void main(String[] args) {

            int numberOne = 10;
            System.out.println(numberOne);
            double doubleNumber = numberOne;
            System.out.println(doubleNumber);

            double doubleNumberTwo = 9.78;
            int numberTwo = (int) doubleNumberTwo;
            System.out.println(numberTwo);
            System.out.println(doubleNumberTwo);

            int a = 10;
            int b = 20;
            System.out.println( (double) a + b);


        }

}
