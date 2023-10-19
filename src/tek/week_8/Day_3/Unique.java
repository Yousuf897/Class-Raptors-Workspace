package tek.week_8.Day_3;

public class Unique {

    public static void main(String[] args) {

        // Using final keyword with variable
        final int maxSpeed;
        int age;

        age= 35;
        maxSpeed = 220;

        age = 50;
//        maxSpeed = 330; // the value of the variable cannot be changed because it has been declared as final!

        System.out.println(maxSpeed);

    }

    public static final void printName() { System.out.println("Alexander"); }

}
