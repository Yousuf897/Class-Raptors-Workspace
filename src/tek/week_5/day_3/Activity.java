package tek.week_5.day_3;

public class Activity {

    // Declare a variable and name it message -> Initialize to "Welcome to TekSchool";
    // Print each one of these words in the above message in a separate line.

    public static void main(String[] args) {

        String message = "Welcome to TekSchool";

        System.out.println("Welcome");
        System.out.println("to");
        System.out.println("TekSchool");

        String[] arrayMessage = new String[3];
        arrayMessage[0] = "Welcome";
        arrayMessage[1] = "to";
        arrayMessage[2] = "TekSchool";

        String[] arrayMessageTwo = {"Welcome", "to", "TekSchool"};

        for (String name : arrayMessageTwo) {
            System.out.println(name);
        }

    }
}
