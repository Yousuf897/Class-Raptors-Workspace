package tek.week_9.day_2;

public class CompileTime {

    public static void main(String[] args) {
        add(1);
        add(1.1);

        display("Bob");

        display();

    }


/*    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b) {
        return a + b;
    }*/

    static int add(int a) {
        return a;
    }

    static double add(double a) {
        return a;
    }


    static void display(String name) {
        System.out.println(name);
    }

    static void display() {
        System.out.println("Something");
    }

}
