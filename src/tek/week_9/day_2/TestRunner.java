package tek.week_9.day_2;

public class TestRunner {

    public static void main(String[] args) {

        String message = "Hello";

        message.toLowerCase();
        message.concat(" From Java!");

        System.out.println( message );

        for (int i = 1; i <= 5; i++) {
            System.out.println( message += i );
        }

        System.out.println( message );

/*      Hello12345
        Hello12345

*/

    }

}
