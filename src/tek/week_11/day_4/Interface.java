package tek.week_11.day_4;

public class Interface {

/*
    In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures,
    default methods, static methods, and nested types. It is a way to achieve abstraction in Java, allowing you to define what methods
    a class should have without specifying how they should be implemented.

    Key Characteristics of an Interface:

    1. Abstract Methods: Interfaces can declare methods, which are implicitly abstract; that is, they cannot have a body (until Java
    8 introduced default methods).

    2. Implementation: A class "implements" an interface by providing concrete implementations for its methods, thus inheriting the
    abstract methods of the interface.

    3. Multiple Inheritance: In Java, a class cannot inherit from multiple classes, but it can implement multiple interfaces.
    This allows for a form of multiple inheritances.

    4. Default Methods: From Java 8 onwards, interfaces can have default methods with a body. These methods are not abstract
    and can provide a default implementation that can be overridden by implementing classes if desired.

    5. Static Methods: Interfaces can have static methods with a body, which belong to the interface class itself and cannot
     be overridden by an implementing class.

    6. Constants: All variables defined in an interface are implicitly public, static, and final (constants).

    Usage of Interfaces:

    Interfaces are used to provide a formal contract between the interface and the classes that implement it. The interface
    defines the "what" (the methods), and the implementing classes define the "how" (the method bodies). This is useful in
    many scenarios, such as:

    Defining polymorphic behavior across different classes that implement the same interface.
    Creating loosely coupled code where the implementation can be easily swapped or mocked (useful in testing).
    Defining constants that can be shared across multiple classes.
    Providing a form of multiple inheritances, as classes can implement multiple interfaces.

*/


}
