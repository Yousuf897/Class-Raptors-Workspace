package tek.week_2.day_2;

public class DecVsIntiVsInstantiation {
/*
    1. Declaration:

    House Building Analogy: This is like setting aside a piece of land to build your house.
    You've made a decision about where you'll build it, but you haven't started the construction
    process yet. The piece of land is allocated, but it's empty.

    In Java: When you declare a variable, you're essentially telling the compiler,
    "I'm going to use a variable with this name and it's going to be of this type."
    However, you're not giving it a value just yet.

    int myNumber;  // Here, we've declared a variable named "myNumber" of type "int",

    but we haven't given it a value.

    2. Initialization:

       House Building Analogy: Now, you've placed the first brick or foundation stone on your piece of land.
        The construction process has started. There's something there now, even if it's just a small part
        of the entire structure.

    In Java: Initialization is when you assign a value to a variable for the first time.

        myNumber = 5;  // We've initialized "myNumber" by giving it a value of 5.

        Or you can declare and initialize at the same time:

        int myNumber = 5;  // Declaration + Initialization

       3. Instantiation:
     Imagine you're not building just any house, but you're constructing
    based on a specific blueprint or design. Instantiation is like taking that blueprint and constructing
    a house from it. Once done, you have a concrete instance or version of that design in real life.

    In Java: This is more related to object-oriented programming. Java is an object-oriented language,
    which means it uses "classes" as blueprints to create "objects". When you instantiate a class, you're
    creating an object (or an instance) of that class.

    Let's take the House class as an example:

class House {
    // Some attributes and methods related to a house
}

    House myHouse = new House();  // Here, we've instantiated the House class. "myHouse" is now an
    object of the House class.

*/

    public static void main(String[] args) {

        int myNumber; // Declared
        myNumber = 10; // Initialized

        int numberTwo = 20; // Declaration + Initialization

        // 1. Go ahead and declare 7 variables ( different data types can be the same as well! )
        // 2. Initialize the variables in which you've just declared ^

        int numOne, numTwo;
        String firstName, lastName;
        boolean flag, isTrue;
        double salary;

        numOne = 10;
        numTwo = 20;
        firstName = "Bob";
        lastName = "Martinez";
        flag = true;
        isTrue = false;
        salary = 10.003450;


    }
}


