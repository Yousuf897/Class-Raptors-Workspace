package tek.week_9.day_3;

public class Test {

    String name;
    int age;
    boolean flag;

    Test(String name, int age, boolean flag) {
        this.name  = name;
        this.age  = age;
        this.flag  = flag;
    }

    Test() {
     this("", 0, false);
    }

    Test(String name, int age) {
       this(name, age, false);
    }

    Test(String name) {
        this(name, 0, false);
    }

}

class TestTwo {
    Test test = new Test("Bob", 16, false);
    Test testTwo = new Test();
    Test testThree = new Test("Alex", 18);
    Test testFour = new Test("Alex");

}
