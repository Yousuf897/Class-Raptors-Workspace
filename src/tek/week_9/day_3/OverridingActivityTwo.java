package tek.week_9.day_3;

public class OverridingActivityTwo {

/*
    Shape Drawing:

    1. Create a class Shape with a method draw() that prints "Drawing a shape".
    2. Create classes Circle, Triangle, and Square that extend Shape. Override the draw() method in each to print
       "Drawing a Circle/Triangle/Square" respectively.
    3. Test drawing different shapes.

*/

    public static void main(String[] args) {

        var shapeObj = new Shape();
        var circleObj = new Circle();
        var squareObj = new Square();
        var triangleObj = new Triangle();

        shapeObj.draw();
        circleObj.draw();
        squareObj.draw();
        triangleObj.draw();

        /*
        * Drawing a shape
          Drawing a Circle
          Drawing a Square
          Drawing a Triangle
        *
        * */


    }

}
