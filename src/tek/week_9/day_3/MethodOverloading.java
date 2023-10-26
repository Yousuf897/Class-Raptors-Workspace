package tek.week_9.day_3;

public class MethodOverloading {

/*

    Method overloading is one of the ways Java achieves compile-time polymorphism. When two or more methods in the same class
    have the same name but different parameters, it's known as method overloading. Here are the rules for method overloading:

    1. Method Name Must Be Same:
    The name of the methods must be the same for method overloading to occur.

    2. Parameters Must Be Different:
    At least one of the following must be true for overloaded methods:
        A. Different number of parameters.
        B. Different types of parameters.
        C. Different order of parameters.

    public class Runner {

    public static int add(int a, int b) {
      return a + b;
    }

    public static int add(int a, int b) {
      return a + b;
    }

    3. Return Type Doesn't Matter:
    Different return types alone don't constitute method overloading. The method return type can be the same or different, but it
    does not play any role in differentiating overloaded methods.

    4. Access Modifiers Can Be Different:
    The access level doesn't affect the ability to overload the method. For instance, one overloaded method can be private while
    another can be public.

    5. Exception Types Can Be Different:
    Overloaded methods can declare different exception types. However, just changing the exception is not enough for overloading.

    6. Static Methods Can Be Overloaded:
    Static methods can be overloaded just like instance methods. However, a static method cannot be overridden as an instance method
    and vice versa.

    7. Constructor Overloading:
    Constructors can also be overloaded in a similar way as methods, by changing the number or type of parameters.

    8. Overloaded Method Must Perform a Different Function:
    This isn't a rule enforced by Java, but it's a best practice. Overloaded methods should always perform related tasks since
    they share a name.

    9. Method Resolution Priority:
    If you use methods that can be invoked with the same call due to boxing, widening, and varargs, the Java compiler follows certain
    priorities:
    Widening over boxing (e.g., int to long vs int to Integer).
    Boxing over varargs.
    No widening with boxing or varargs.

    10. Varargs Can Be Used for Overloading:
    Methods can be overloaded with different types and numbers of parameters, including varargs. However, overloading a method with a
    varargs parameter can be tricky and can lead to ambiguous situations.


*/


    // Rule number 2 -> B
    public  int add(int a, int b) {
        return a + b;
    }

    public  double add(double a, int b) {
        return a + b;
    }

    // Rule number 2 -> C
    public  double add(int a, double b) {
        return a + b;
    }

    // Rule Number 3
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int b, short a) {
        return b * a;
    }



    static int subtract(int a, int b) {
        return a - b;
    }

    static int subtract(int a, int b, int c) {
        return a - b - c;
    }


    public static void main(String[] args) {

        System.out.println( subtract(10, 5) ); // 5
        System.out.println( subtract(10, 5, 3) ); // 2

    }

}
