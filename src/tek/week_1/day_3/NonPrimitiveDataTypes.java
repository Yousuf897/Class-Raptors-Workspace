package tek.week_1.day_3;

public class NonPrimitiveDataTypes {
    /*
    *   B: Non-Primitive Data Types (Reference Types)
    *           1. String
    *            2. Array
    *            3. Class
    *            4. Interface
    *
    *
    *    These are more complex containers that can hold multiple values or a mix of different types.
    *
    *    The main non-primitive types are:
    *
    *   1. String: Like a text box, holds a sequence of characters.
    *        String name = "Alice";
    *
    *   2. Arrays: Like a tray with multiple slots, an array can hold multiple values of the same type.
    *       int[] scores = {90, 85, 77};
    *
    *   3. Classes and Objects: Think of these as customizable containers
    *       that can hold both variables and methods.
    *
    *  4. Interfaces: These are like templates for classes, specifying what methods a class must have.
    *
    *   Understanding data types is crucial because it helps you choose the right type of "container" for your
    *   data, making your code both efficient and functional.
    *   Just like you wouldn't store milk in a basket or apples in a bottle,
    *   you want to make sure you're using the
    *   appropriate data type for each piece of information in your Java programs.
    *
     */

    public static void main(String[] args) {

        // Declare two String variables
        String firstName, lastName;
        // Initializing the variables
        firstName = "Alex";
        lastName = "Payne";
        // Printing the values of the String variables
        System.out.println(firstName);
        System.out.println(lastName);

        // Declare an array of integers and store some values inside of the array
        int[] number = {10,20,30};

    }
}
