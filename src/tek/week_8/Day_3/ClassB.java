package tek.week_8.Day_3;

public class ClassB extends ClassA {



    ClassB(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    void printInfoClassB() {
        System.out.println("Age: " + age );
    }

/*     void printName() {
        System.out.println("Calling this method from the child class");
    }*/

    // Because printName in classA is declared as final -> so it cannot be override.

}
