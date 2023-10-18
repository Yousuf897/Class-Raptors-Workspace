package tek.week_8.Day_2;

public class ClassB extends ClassA {

    String name;

    void test() {
        System.out.println( super.name );
    }

    void display() {
        super.display();
        System.out.println("Printing a message from class B!");
    }

    void testTwo() {
        this.display();
        super.display();
    }

    public ClassB() {
        super();
        System.out.println("ClassB Constructor is being called");
    }

}
