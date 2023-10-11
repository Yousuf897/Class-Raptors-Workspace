package tek.week_7.day_1;

public class Employee {

    String firstName, lastName;
    double salary;
    int age;

    public Employee() {
        firstName = null;
        lastName = null;
        salary = 0.0;
        age = 0;
    }

    public void printEmpInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

}
