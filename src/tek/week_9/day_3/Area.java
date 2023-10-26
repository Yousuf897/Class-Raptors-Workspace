package tek.week_9.day_3;

public class Area {


    /*
    Area Calculator:

    Create a class Area.
    Design overloaded methods to calculate the area.

    1. For a circle (takes one double - radius). -> formula: PI * radius * radius

    2. For a rectangle (takes two doubles - length and width). -> formula: length * width

    Test the methods to calculate different areas.

    PiValue "3.141592653589793"

*/

    double PI = 3.141592653589793;

    double PiMath = Math.PI;


    double calculateArea(double radius) {
        return PiMath * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

}
