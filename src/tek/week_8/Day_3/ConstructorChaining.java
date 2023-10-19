package tek.week_8.Day_3;

public class ConstructorChaining {

/*
    Real-life Analogy:

    Imagine building a house. First, you lay the foundation. Once the foundation is in place, you build the walls, followed by the
    roof, then the interior, and finally, the decorations. Each step relies on the previous steps being completed, and you cannot
    skip a step. Just as building a house is a series of dependent steps, constructor chaining is about calling one constructor from
    another, ensuring that object creation follows a defined series of steps.

    Programming Explanation:

    In Java, constructor chaining is the process of calling one constructor from another with respect to the current object.
    Constructor chaining can be done in two ways:

    I. Within the same class: A constructor can call another constructor of the same class using the this keyword. This is useful
     when you have multiple overloaded constructors and want to consolidate initialization in one primary constructor.

    II. From the base class: A subclass constructor can call a constructor of its superclass using the super keyword. This ensures
    that the initialization code of the superclass is executed before the subclass does its own initialization.

    Benefits:

    1. Helps in reducing code duplication.
    2. Ensures a specific order of constructor execution.
    3. Enhances object initialization process clarity.


class Person {

    String name;
    int age;

    // Default constructor
    Person() {
        this("Unknown", 0);  // Calls the parameterized constructor of the same class
    }

    // Parameterized constructor
    Person(String name) {
        this(name, 0);  // Calls another parameterized constructor of the same class
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        super(name, age);  // Calls the parameterized constructor of the superclass (Person)
        this.salary = salary;
    }
}

public class TestChaining {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice");
        Employee employee = new Employee("Bob", 30, 50000.0);
    }
}


*/


}
