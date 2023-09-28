package tek.week_5.day_3;

public class InterviewQuestion {

        public static void main(String[] args) {

        String message = "Welcome to TekSchool";
        System.out.println(message.charAt(0));

        for (int index = 0; index < message.length(); index++) {
            if (message.charAt(index) == ' ') {

            } else {
                System.out.print(message.charAt(index));
            }

        // when you want to print only a specific character form the message itself.
            // print if the character is equal to 'X'
            // X -> the character in which you want to see!

/*            for (int index = 0; index < message.length(); index++) {
                if (message.charAt(index) == 'X') {
                    System.out.print(message.charAt(index));
                } else {
                    // DO NOTHING
                }*/


        }
    }
}
