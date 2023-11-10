package tek.week_11.day_4;

public class ClassB extends ClassA {

    public void printClassB() {
        System.out.println("ClassA");
    }

    @Override
    public void myAbstractMethod() {
        System.out.println("I have implemented the abstract method in child class!");
    }

    @Override
    void myAbstractMethodWithoutAccessModifier() {
        System.out.println("I have implemented the abstract method in child class!");
    }
}
