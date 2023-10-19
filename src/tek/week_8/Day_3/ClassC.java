package tek.week_8.Day_3;

public class ClassC {

    String firstName;
    int age;

    ClassC() { this("", 0); }

    ClassC(String firstName) {
        this(firstName, 0);
    }

    ClassC(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    void printInfo() {
        System.out.println("FirstName " + firstName + " age: " + age    );
    }

    public String toString() {
        return "FirstName " + firstName + " age: " + age;
    }

}
