package tek.review.day_2;

public class BuiltInMethods {

    public static void main(String[] args) {

        String message = "Welcome to TekSchool";
        String newMessage = "";

        // Build In methods

        // To get the length of the message we have to use the length()
        System.out.println( message.length() );

        // How to remove the spaces in between the sequence of characters
        for ( int index = 0; index < message.length(); index++ ) {
            if ( message.charAt(index) == ' ' ) {
                message = message.replace(message.charAt(index), '_'); // we need to pass character
            }
        }

        // How to remove the spaces in between the sequence of characters
//        for ( int index = 0; index < message.length(); index++ ) {
//            if ( message.charAt(index) == ' ' ) {
//
//            } else {
//                message.concat(message);
//            }
//        }

        message.replaceAll("\\ s+", " ");

        // Print the updated Version of the message
        System.out.println( message );



    }

}
