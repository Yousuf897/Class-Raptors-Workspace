package tek.week_9.day_3;

public class BreakActivity {

/*
    Area Calculator:

    Create a class Area.
    Design overloaded methods to calculate the area.

    1. For a circle (takes one double - radius). -> formula: PI * radius * radius

    2. For a rectangle (takes two doubles - length and width). -> formula: length * width

    Test the methods to calculate different areas.

    PiValue "3.141592653589793"

*/


    public static void main(String[] args) {

        var areaObj = new Area();

        System.out.println("Area of a circle with radius of 6 is: " + (int) areaObj.calculateArea(6));
        System.out.println("Area of a rectangle with length of 6 and width of 4: " + (int) areaObj.calculateArea(6, 4));

    }

}
