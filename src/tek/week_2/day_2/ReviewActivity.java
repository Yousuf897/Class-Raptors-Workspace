package tek.week_2.day_2;

public class ReviewActivity {

    /*
    *  If I have a String variable that holds this values "   Welcome to TekSchool!"
    *  Apply the following operations to that variable and return the result.
    *
    *   1. Get me the length of that String
    *   2. Remove the spaces from the beginning of the value.
    *   3. Replace TekSchool with "Java Session!".
    *
    * */

    public static void main(String[] args) {

        String message = "   Welcome to TekSchool!";

        System.out.println("The length of the message is: " + message.length());
        System.out.println(message.trim());
        System.out.println(message.replace("TekSchool!", "Java Session!"));
        System.out.println(message);

        message = message.trim();

        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

        message.trim();


    }

}
