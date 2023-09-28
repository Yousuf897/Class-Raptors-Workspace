package tek.week_5.day_3;

public class StringSplitMethod {
    /*
    * Real-Life Analogy:

      String - split():

        Imagine you have a string of Christmas lights with different colored bulbs: red, green, blue, and yellow.
        * Each bulb is separated by a special connector. When you want to rearrange the lights,
        * you disconnect the string at these connectors, and you're left with individual bulbs.
        * Using the split() method on a string with a specific delimiter is like disconnecting the
        * Christmas light string at the connectors, leaving you with segments (or substrings)
        * based on where those connectors (delimiters) were located.

    * */

    public static void main(String[] args) {

        String message = " Welcome, to, TekSchool";
        String[] words = message.split(",");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * * ");


        String secondMessage = "I love, coding in java!";
        String[] messageWords = secondMessage.split(" ");

        for (String word : messageWords) {
            System.out.println(word);
        }
    }
}
