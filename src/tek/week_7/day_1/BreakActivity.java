package tek.week_7.day_1;

public class BreakActivity {

    // Create one class that is going to store the information of a mobile phone!
    // Create another class that is going to store the information of students!
    // Create another class that is going to store the information of an employee

    // for each one of these classes, create the members of the class. (Fields (variables) methods (functions) );

    public static void main(String[] args) {

        Employee empObj = new Employee();

        empObj.firstName = "Bob";
        empObj.lastName = "Alexander";
        empObj.salary = 35_000;
        empObj.age = 25;

        empObj.printEmpInfo();

        System.out.println("--------------------------");

        Employee emp2Obj = new Employee();

        emp2Obj.firstName = "Tylor";
        emp2Obj.lastName = "Tylor LastName";
        emp2Obj.salary = 45_000;
        emp2Obj.age = 27;

        emp2Obj.printEmpInfo();
    }
}
