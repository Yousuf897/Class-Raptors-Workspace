package tek.week_11.day_4;

public class Exception {

/*
    In Java, an exception is an event that disrupts the normal flow of the program's instructions during execution. When an error
    occurs within a method, the method creates an object and hands it off to the runtime system. This object is called an exception object.
    It contains information about the error, including its type and the state of the program when the error occurred.

    Java exceptions are managed through five keywords: try, catch, finally, throw, and throws.

    Types of Exceptions:

    1. Checked Exceptions: These are exceptional conditions that a well-written application should anticipate and recover from.
    They are checked at compile-time, which means that the compiler checks to see if these exceptions are handled with a try-catch
     block or declared with a throws clause in the method signature. If not, the code will not compile. Examples include IOException,
     SQLException, etc.

    2. Unchecked Exceptions: These are exceptions that typically reflect errors in your program's logic and cannot be reasonably
    recovered fromat runtime, like NullPointerException, ArrayIndexOutOfBoundsException, etc. They are not checked at compile time;
    the compiler does not require methods to catch or to specify them. Unchecked exceptions are subclasses of RuntimeException.

    3. Errors: These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors
     are typically ignored in your code because you can rarely do anything about an error. For example, OutOfMemoryError occurs when the
     JVM runs out of memory. Errors are subclasses of Error.

    */
}
