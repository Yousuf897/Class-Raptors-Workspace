package tek.week_5.day_3;

public class toCharActivityOne {

/*
     Get each character from this message
     Get each word from this message

    print the characters
    print the words

    String message = "I would love to code in java and it's very easy to learn!";*/

    public static void main(String[] args) {

        String message = "I would love to code in java and it's very easy to learn!";
        char[] characters = message.toCharArray();

        for (char character : characters) {
            System.out.println(character);
        }

        String[] words = message.split(" ");

        for (String word : words) {
            System.err.println(word);
        }

    }

}
