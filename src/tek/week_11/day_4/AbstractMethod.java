package tek.week_11.day_4;

public class AbstractMethod {

/*
    An abstract method in Java is a method that is declared without an implementation. Abstract methods provide a blueprint for
    other methods to be implemented in subclasses. The purpose of an abstract method is to enforce method overriding, ensuring that
    subclasses provide concrete implementations for certain behaviors that are appropriate to them.

    Key Points About Abstract Methods:

    1. Declaration: An abstract method is declared with the abstract keyword and does not have a body; it ends with a semicolon instead
    of a block.

    2. Containing Class: An abstract method can only exist within an abstract class or an interface. Consequently, if a class includes even
    a single abstract method, the class itself must be declared abstract.

    3. Subclass Implementation: Any concrete subclass (a class that is not abstract) of an abstract class must provide concrete implementations
     for all of its abstract methods, unless the subclass is also declared abstract.

    4. Purpose: Abstract methods are used when the superclass does not know the implementation of a method. The implementation logic depends
    on the specific subclass that extends the abstract superclass.

    5. Access Modifiers: Abstract methods can have any access modifier (public, protected, default, but not private), and they can be part
    of the interface without any access modifier, as all interface methods are implicitly public.

*/

}
