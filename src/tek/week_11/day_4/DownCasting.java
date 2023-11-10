package tek.week_11.day_4;

public class DownCasting {

/*
    Downcasting:

    Real-life analogy:

    Continuing with our vehicles example: if you have a general category of a vehicle and someone tells you it's specifically a car,
    you're making it more specific. This specialization is similar to downcasting.

    Programming Explanation:

     Downcasting is the opposite of upcasting. It's the process of converting a superclass reference back to a subclass reference.
     Unlike upcasting, downcasting requires explicit casting because you're attempting to change a general reference to a specific one,
     which Java does not allow automatically due to type safety.


     Why is Downcasting needed?
     You might need downcasting when you have a reference to a superclass, but you need to access methods or variables specific
     to a subclass. It's a way of telling the Java compiler, "I know this reference is actually of this specific subclass type."


*/

    public static void main(String[] args) {

        double numberOne = 10.2;
        double numberTwo = 20.5;

        double result =  numberTwo / numberOne;

        System.out.println( result );

        System.out.println( (int) (numberTwo / numberOne)  );;

        /* 2.0098039215686274  */

        /*       2 */



    }

}
