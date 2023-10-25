package tek.week_9.day_2;

public class ReverseString {

    public static void main(String[] args) {

        String message = " Welcome to TekSchool! ";

        String reverseMessage = "";

        var stb = new StringBuilder(message);

        System.out.println("Original version of the message: " + stb);

        stb.reverse();

        System.out.println("Reversed version of the message: " + stb);


        // OutPut:

/*        Original version of the message: Welcome to TekSchool!
          Reversed version of the message: !loohcSkeT ot emocleW

*/

    }
}
