package tek.week_6.day_3;

public class MethodExampleTwo {

    public static void printDetails(String firstName, String lastName, int age, double salary, int phoneNumber) {
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("PhoneNumber: " + phoneNumber);
    }


    public static void main(String[] args) {
        printDetails("Alex", "Alexander",  28, 15_000, 222-222-2222);
//        printName();
        String[] names = {"Alex", "Bob", "Tony", "Tek", "School"};
        printArray(names);
    }


    public static void printName() {
        String firstName = "Tylor";
        System.err.println("The value of variable from my method is: " + firstName);
    }

    public static void printArray(String[] arrayName) {
        for (int index = 0; index  < arrayName.length; index++) {
            System.out.print(arrayName[index] + " ");
        }
    }
}
