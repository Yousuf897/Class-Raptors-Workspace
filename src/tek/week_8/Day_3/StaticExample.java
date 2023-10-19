package tek.week_8.Day_3;

public class StaticExample {

     static  String name = "Bob";

     static int count = 10;

    public static void main(String[] args) {
        System.out.println(name);
    }

    StaticExample() {
        count++;
    }


}
