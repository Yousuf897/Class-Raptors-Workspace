package tek.week_7.day_1;

public class TestTwo {

    static int numberOfDoors;

    public static void main(String[] args) {

        System.out.println(numberOfDoors);

        Employee empObj = new Employee();

//        System.out.println(empObj.firstName.toLowerCase());

        empObj.printEmpInfo();

        printName("Alex");
    }

    public static void printName(String name) {
        System.out.println("Your name is: " + name);
    }

}
