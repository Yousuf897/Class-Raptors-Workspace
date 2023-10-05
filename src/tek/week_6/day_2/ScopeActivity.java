package tek.week_6.day_2;

public class ScopeActivity { // LifeTime of Instance variable starts

    static String name = "Bob"; // Instance or Class Scope variable


    public static void main(String[] args) { // LifeTime of local variable starts

        System.out.println(name); // I can Access the instance variable from a method that is within the range of class!

        int localVariable = 20;

        if (true) { // LifeTime of another local variable starts

            System.out.println(localVariable);
            int anotherLocalVariable = 50;

            System.out.println(anotherLocalVariable);

        } // LifeTime of another local variable ends

      //  System.out.println(anotherLocalVariable);]

    System.out.println(name); // I can Access the instance variable from a method that is within the range of class!

    } // LifeTime of local variable ends

 } // LifeTime of Instance variable ends
