package tek.week_9.day_1;

public class String_Pool {

/*
    Real-life Analogy:

    Think of the String Pool as a special bookshelf in a library dedicated only for unique titles of books (strings in this analogy).
    If a person (a program or code snippet) asks for a title and it's already on this bookshelf, the librarian (the JVM) just points
    to that book. If the title isn't on the bookshelf yet, the librarian adds it. This ensures that this special bookshelf doesn't have
    multiple copies of the same title, saving space and making referencing more efficient.

    Programming Explanation:

    In Java, the String class has a special feature called the " String Pool ". The String Pool is a dedicated area of the Java heap
    memory where the JVM stores string literals. The idea behind the String Pool is to save memory by reusing common string literals.

    1. Storage of Literals: When you create a string literal in your code, like String greeting = "Hello";, the JVM checks if the string
     "Hello" is already present in the String Pool.

    2. Reusing String Literals: If the string is already present, the JVM reuses the reference to that string in the pool. This means
    two string literals with the same value will have the same memory address.

    Adding to the Pool: If the string does not exist in the String Pool, the JVM adds it and assign an address to it.

    intern() Method: Java also provides a method called intern() which allows you to manually ensure that a particular string object's
     value is stored in (or retrieved from) the String Pool. This can be useful when working with strings constructed using methods
     or StringBuilder, and you want to ensure efficient memory usage.

    Immutability & Efficiency: Strings in Java are immutable. This quality allows strings to be pooled safely. Since pooled strings
    can be referenced by multiple parts of an application, immutability ensures that one part of the application can't inadvertently
    modify the string's value for another part.

    Example in Java:

    String str1 = "Java";          // String literal; the JVM checks the String Pool.
    String str2 = "Java";          // Again checks the String Pool, finds "Java" and reuses the reference.
    String str3 = new String("Java").intern(); // Explicitly interned, reuses the reference from the String Pool.

System.out.println(str1 == str2);  // true, because they both point to the same string in the String Pool.
System.out.println(str1 == str3);  // true, because str3 is interned to refer to the String Pool's "Java".
*/


}
