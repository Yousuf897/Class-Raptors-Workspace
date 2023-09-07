package tek.week_2.day_2;

public class StringMethods {

    public static void main(String[] args) {
        String message = "Welcome to TekSchool A";
        System.out.println( "index of TekSchool: " + message.indexOf("TekSchool"));

        System.out.println("Length of the message: " + message.length());

        System.out.println(message.length() - 1);

        // charAt(): gives you the values that is stored in the specific index!

        System.err.println(message.charAt(13));
        System.err.println(message.charAt(12));
        System.err.println(message.charAt(9));
        System.err.println(message.charAt(18));
        System.err.println(message.charAt(18));
        // Hold Control + D -> Anywhere in the line that you would like to duplicate!
        System.out.println("Values from index 11 to 19: " + message.substring(11));


        // How to compare two String values
        String firstName = "Bob";
        String lastName = "Bob";

        System.out.println( 10 == 10 );
    }
}
