package tek.week_1.day_3;

public class UnderstandingOfDataTypes {
    /*
    * Data types in Java are like different types of containers you have in your kitchen:
    * you have jars for liquids, baskets for fruits, and racks for spices.
    *
    * Similarly, data types in Java define what kind of data a variable can store.
    *
    * Java has two genera types of data (Data Types):
    *
    *   A: Primitive Data Types
    *        1. byte
    *        2. short
    *        3. int
    *        4. long
    *        5. float
    *        6. double
    *        7. char
    *        8. boolean
    *
    *       1.Byte: Like a tiny jar, it holds small integer values ranging from -128 to 127.
    *        byte smallNumber = 100;
    *
    *       2. Short: A slightly bigger jar that holds a wider range of integers (-32,768 to 32,767).
    *           short mediumNumber = 30000;
    *
    *      3. int: The most commonly used jar for integers, with a range from -2^31 to (2^31 - 1).
    *        int age = 30;
    *
    *     4.  Long: A big jar for really large integers.
    *         long bigNumber = 3000000000L;
    *
    *     5. Float: A bottle for floating-point (decimal) numbers, with 6-7 decimal places of precision.
    *       Float literals need an 'F' at the end.
    *        float height = 5.9F;
    *
    *     6. Double: Like a bigger bottle for floating-point numbers, with up to 15 decimal places of precision.
    *        double pi = 3.141592653589793;
    *
    *    7. Char: A tiny box for a single character.
    *        char initial = 'A';
    *
    *   8. Boolean: A toggle switch that can be either true or false.
    *       boolean isActive = true;
    *
    * */

    public static void main(String[] args) {

        // Declaring two variables with data type byte
        byte firstSmallNumber, secondSmallNumber;
        // Initializing the first and second variables.
        firstSmallNumber = 127;
        secondSmallNumber = 120;
        // printing the values of the variables.
        System.out.println(firstSmallNumber);
        System.out.println(secondSmallNumber);

        // Declare two short variables
        short mediumNumberOne, mediumNumberTwo;
        // Initializing my short variables.
        mediumNumberOne = 29950;
        mediumNumberTwo = -32000;
        // printing the values of the variables.
        System.out.println(mediumNumberOne);
        System.out.println(mediumNumberTwo);

        // Declare two int variables
        int salaryOne, salaryTwo;
        // Initializing my int variables.
         salaryOne = 1500;
         salaryTwo = 2500;
        // printing the values of the variables.
        System.out.println(salaryOne);
        System.out.println(salaryTwo);

        // Shift + F10 to run your program.

        // Declare two long variables
        long largeNumberOne, largeNumberTwo;
        // Initializing my long variables.
        largeNumberOne = 1_000_000_000;
        largeNumberTwo = 2_000_000_000;
        // printing the values of the variables.
        System.out.println(largeNumberOne);
        System.out.println(largeNumberTwo);

        // Declare two char variables
        char characterOne, characterTwo;
        // Initializing my char variables.
        characterOne = 'A';
        characterTwo = 'B';
        // printing the values of the variables.
        System.out.println(characterOne);
        System.out.println(characterTwo);

        // Declare two boolean variables
        boolean flag, isActive;
        flag = false;
        isActive = true;
        // printing the values of the variables.
        System.out.println(flag);
        System.out.println(isActive);



    }
}
