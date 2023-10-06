package tek.week_6.day_3;

public class MethodsExampleOne {

    public static void main(String[] args) {

        // Create a method that is going to take the name of a user and print it's name.

        // I am going to give you a name -> Alex
        // Create a method that is going to take this Alex and then print for example Hello Alex!
        // Hello NAME

        String name = "Alex";

        printName(name);
        printMessage();

        printName("Tylor");
        printName("Bob");

        printName("Tony", 25);


    }

    public static void printName(String name) {
        System.out.println("Hello " + name);
        printMessage();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }

    public static void printName(String name, int age) {
        System.out.println("Hello " + name + " your age is: " + age);
        printMessage();
    }

}
