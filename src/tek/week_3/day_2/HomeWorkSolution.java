package tek.week_3.day_2;

    /*
    * Understand Basic Binary

Every digit in binary is called a "bit" and can either be a 0 or a 1. It's a base-2 system
* (compared to our usual base-10 decimal system).

For example:
*
In decimal: 254 can be broken down as (2 x 100) + (5 x 10) + (4 x 1)
In binary: 110 can be broken down as (1 x 4) + (1 x 2) + (0 x 1) = 6 in decimal


What's a byte in Java?

A byte in Java uses 8 bits. It can represent numbers from -128 to 127.

Why such a weird range? This is where two's complement comes in.
*
*
*   Understanding Two's Complement

    Positive numbers: They are the same as normal binary numbers.

    E.g., 5 in binary is 0101 (when expressed in 4 bits for simplicity).

    Negative numbers: This is a bit tricky. To represent a negative number:

    a. Write the positive version in binary.

    b. Invert all the bits (change 0s to 1s and vice versa).

    c. Add 1 to the result.

    For example, to represent -5 in a 4-bit binary:

    a. Positive 5 = 0101

    b. Invert = 1010 + 1  = 1011

    c. Add 1 = 1011

So, -5 in a 4-bit two's complement binary is 1011.
*
*
*
*   Back to Our Problem - Casting 254 to a byte

Remember, a byte can only hold 8 bits.

    First, write 254 in binary (without worrying about sign):

    254 = 1 1 1 1 1 1 1 0

    Now, let's interpret that as an 8-bit two's complement number:

    The leftmost bit is 1, which means it's a negative number.

    To find out what negative number it is, we'll do the inverse of the process for finding negative numbers:

    a. We don't have to convert to a positive binary because we're just trying to determine the value of
    * the negative binary.

    b. Invert the bits: 0 0 0 0 0 0 0 1

    c. Add 1: 00000010

This is the binary for 2. Because the original number was negative (due to the leftmost bit being 1), the value
*  is -2.


When you try to fit 254 (which is 11111110 in binary) into an 8-bit byte in Java,
* it is interpreted as -2.
*
*
* */

public class HomeWorkSolution {

    public static void main(String[] args) {
        // Why am I getting -2 at the result.
        double Number8 = 254.45;
        System.out.println(Number8);
        int Number9 = (byte) Number8;
        System.err.println(Number9);

        System.out.println();
    }

}
