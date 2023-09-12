package tke.week_3.day_1;

    // Promotion

/*
    Imagine you're organizing books on a bookshelf based on their sizes, from small pocketbooks to
    larger encyclopedias. One day, you decide to place all your books into bigger
    encyclopedia-sized boxes, regardless of their original size. Small pocketbooks,
    medium-sized novels, and even slightly larger textbooks all get their own big encyclopedia-sized box.
    By doing this, you're ensuring that every book has at least the space of the largest book,
    even if it doesn't need it. This act of giving all the books the same larger space is similar
    to promotion in Java.

Promotion in Java:

In Java, promotion refers to the process where a smaller data type is automatically converted
(or promoted) to a larger data type without any explicit request from the developer.
This is done mainly to prevent loss of data and ensure compatibility when performing operations
with variables of different data types.

Here are some general rules for promotion:

    Byte, Short, and Char: When you use the byte, short, or char data types in an expression,
    they are promoted to int if any operand is an int.
    // short shortNumber = 10;
    // int intNumber = 20;
    // System.out.println( shortNumber + intNumber );

    Int: If one operand is a long, the whole expression is promoted to long.

    Float: If one operand is a float, the entire expression is promoted to float.

    Double: If any of the operands are double, the entire expression is promoted to double.

*/

public class Promotion {
    public static void main(String[] args) {
        // declare one int variable and initialize a value.
        // declare one double variable and initialize a value.
        int numberOne = 10;
        long longNumber = 100_000L;
        double numberTwo = 20;
        System.out.println(numberOne + numberTwo + longNumber);

        // conversion with char
        char character = 'g';
        short shortNumber = 5;
        byte byteNumber = 10;
        int intNumber = 20;

        System.out.println( character + shortNumber + byteNumber + intNumber);


    }
}
