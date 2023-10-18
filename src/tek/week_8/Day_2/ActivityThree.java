package tek.week_8.Day_2;

public class ActivityThree {

/*
    Activity 3: Computing Devices

    Background: Over the years, the computing world has seen various devices, each with its specialty. While all
    are computing devices, their primary functions can vary.

    Task 1: Construct a class framework for this scenario.

    1. Start with a base class ComputingDevice that has attributes like brand and storageCapacity. Include methods such as turnOn()
    and turnOff().

    2. Derive a class Laptop from ComputingDevice. Add a method fold(), which represents the laptop's ability to be folded.
    Form another class Tablet based on ComputingDevice. Introduce a method touchScreen(), symbolizing the tablet's touch interface.

    Task 2: Instantiate Laptop and Tablet objects. Call their general functions (turnOn() and turnOff()) as well as their unique
    functionalities (fold() and touchScreen()). What do you anticipate the console will display?

*/

    public static void main(String[] args) {

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * * ");

        var secObj = new SecondLaptop();
        var taObj = new Tablet();

        // Calling the parent functions through the Laptop object.
        secObj.turOn();
        secObj.turnOff();
        secObj.fold();

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * * ");

        // Calling the parent functions through the Tablet object.
        taObj.turOn();
        taObj.turnOff();
        taObj.touchScreen();

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * * ");


    }

}
