package tek.week_8.Day_2;

public class ActivityTwo {

/*
    Activity 2: Birds in Nature

    Background: Birds are a fascinating part of the animal kingdom. While all birds have certain common characteristics,
    different species have their unique behaviors and abilities.

    Task 1: Design a class structure that captures this.

    Create a base class Bird with attributes like name and color and methods such as fly() and sing().

    Derive a class Eagle from Bird. Introduce a new method soarHigh(), which represents the eagle's ability to fly at great altitudes.

    Derive another class Parrot from Bird. Add a method mimicSound(), capturing the parrot's ability to mimic different sounds.

    Task 2: Create objects for both Eagle and Parrot. Invoke their general methods (fly() and sing()) and their specific methods
    (soarHigh() and mimicSound()). What's the expected output?

*/

    public static void main(String[] args) {

        // Create instance of both eagle and parrot classes.
        Eagle eObj = new Eagle();
        Parrot pObj = new Parrot();

        eObj.name = "Eagle";
        eObj.color = "Brown";

        // Calling the methods from parent class through the object of Eagle!
        eObj.fly();
        eObj.sing();
        eObj.soarHigh();

        System.out.println(" * * * *  * * * *  * * * *  * * * *  * * * *  * * * *  * * * *  * * * * ");

        pObj.name = "Parrot";
        pObj.color = "Blue";

        // Calling the methods from parent class through the object of Parrot!
        pObj.fly();
        pObj.sing();
        pObj.mimicSound();
    }

}
