package tek.week_2.day_2;

public class LiteralsVsReference {

/*
    1. What is a Literal?

    In programming, a literal refers to any value that's directly written into the code.
    It represents a fixed value. You can think of literals as the explicit data we provide in our programs.

    Examples:

            5 is an integer literal.
            'A' is a character literal.
            "Hello" is a string literal.
            3.14 is a floating-point literal.

2. What is a Reference Variable?

    A reference variable is a variable that holds the memory address (or reference) of an object,
    rather than the actual object itself. It's essentially a pointer to the location in memory where the
    object data is stored.

    In Java, all non-primitive data types (like objects and arrays) are referred to by reference variables.
    The basic data types (int, char, float, etc.) are the exception; they use value variables,
    not reference variables.

    Literal vs. Reference Variable: An Analogy

    Imagine a bookshelf with a collection of books.

    1. Literal: A literal would be like writing a note with the book's title on it.
    For example, a note saying "Harry Potter" represents that specific book, just as the number 5
    represents that specific integer.

    2. Reference Variable: A reference variable would be like having a bookmark with an
    instruction on where to find a specific book. For example, "3rd shelf, 5th book from the left".
    This bookmark doesn't hold the book's content, but it points you to its location, just like a reference
    variable doesn't hold the object's content but points to its location in memory.
*/

    public static void main(String[] args) {

        String firstName = new String("Bob");
        String lastName = new String("Bob");

        System.out.println(firstName.equals(lastName));

    }
}
